package sax;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
public class readUnitedStudents {
    /**
     * @方法功能描述: 读取XML形式的文本，获取document对象
     * @方法返回类型:Document
     * @param xmlText
     *            xml字符串
     * @return
     */
    public static Document getDocumentFromText(String xmlText) {
        Document document = null;
        try {
            document = DocumentHelper.parseText(xmlText);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }



    /**
     * @方法功能描述: 根据document对象获取根节点
     * @方法返回类型:Element
     * @param document
     * @return
     */
    public static Element getRootElement(Document document) {
        Element element = null;
        if (Objects.isNotNull(document)) {
            element = document.getRootElement();
        }
        return element;
    }



    /**
     * @方法功能描述: 根据DOM树路径，获取指定节点的子节点(包含该指定节点)
     * @方法返回类型:List<Element>
     * @param xmlText
     * @param xPath
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Element> getAppointedElementList(String xmlText, String xPath) {
        // 定义list
        List<Element> elements = new ArrayList<Element>();
        // 获取document对象
        Document document = getDocumentFromText(xmlText);
        // 获取根节点
        Element rooElement = getRootElement(document);
        if (Objects.isNull(xPath) || Objects.isEmpty(xPath)) {
            elements.add(rooElement);
            return elements;
        } else {
            elements = rooElement.selectNodes(xPath);
            if (elements.size() == 0) {
                logger.error("xPath（DOM树路径）出现错误！");
            }
        }
        return elements;
    }




    /**
     * 遍历当前节点元素下面的所有(元素的)子节点
     *
     * @param node
     */
    public static void arrayNodes(Map<String, Object> nodeMap, Element node, Element root) {
        System.out.println("----------------------------");
        // 当前节点的名称、文本内容和属性
        System.out.println("当前节点名称：" + node.getName());// 当前节点名称
        if (!(node.getTextTrim().equals(""))) {
            System.out.println("当前节点的内容：" + node.getTextTrim());// 当前节点名称
        }
        String nodeName = node.getName();
        String nodeValue = node.getTextTrim();
        nodeMap.put(nodeName, nodeValue);
        // 当前节点下面子节点迭代器
        @SuppressWarnings("unchecked")
        Iterator<Element> it = node.elementIterator();
        // 遍历
        while (it.hasNext()) {
            // 获取某个子节点对象
            Element e = it.next();
            // 对子节点进行遍历
            arrayNodes(nodeMap, e, root);
        }
    }





    /**
     * @方法功能描述: 解析XML，并将节点为KEY,值为VALUE，存入Map<String,Object>
     * @方法返回类型:Map<String,Object>
     * @param xmlText
     * @param xPath
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getAppointedElementTextMap(String xmlText, String xPath) {
        Map<String, Object> elementMap = new HashMap<String, Object>();
        // 定义list
        List<Element> elements = new ArrayList<Element>();
        // 获取document对象
        Document document = getDocumentFromText(xmlText);
        // 获取根节点
        Element rooElement = getRootElement(document);
        if (Objects.isNull(xPath) || Objects.isEmpty(xPath)) {
            elements.add(rooElement);

        } else {
            elements = rooElement.selectNodes(xPath);
            if (Objects.isNotNull(elements)) {
                for (Element element : elements) {
                    arrayNodes(elementMap, element, rooElement);
                }
            }
            if (elements.size() == 0) {
                logger.error("xPath（DOM树路径）出现错误！");
            }
        }
        return elementMap;
    }





    /**
     * @方法功能描述: 解析XML，并将节点为KEY,值为VALUE，存入List<Map<String,Object>>
     * @方法返回类型:Map<String,Object>
     * @param xmlText
     * @param xPath
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Map<String, Object>> getAppointedElementTextList(String xmlText, String xPath) {
        List<Map<String, Object>> elementList = new ArrayList<Map<String, Object>>();
        Map<String, Object> elementMap = new HashMap<String, Object>();
        elementMap = new HashMap<String, Object>();
        // 定义list
        List<Element> elements = new ArrayList<Element>();
        // 获取document对象
        Document document = getDocumentFromText(xmlText);
        // 获取根节点
        Element rooElement = getRootElement(document);
        if (Objects.isNull(xPath) || Objects.isEmpty(xPath)) {
            elements.add(rooElement);

        } else {
            elements = rooElement.selectNodes(xPath);
            if (Objects.isNotNull(elements)) {
                for (Element element : elements) {
                    Element elementParent = element.getParent();
                    elementMap = new HashMap<String, Object>();
                    arrayNodes(elementMap, element, rooElement);
                    List<Attribute> attributes = elementParent.attributes();
                    if (attributes.size() > 0) {
                        for (Attribute attr : attributes) {
                            // 将属性名称(key)和属性值(value)添加到map对象中
                            elementMap.put(attr.getName(), attr.getValue());
                        }
                    } else {
                        logger.warn("该节点没有任何属性节点！");
                    }
                    elementList.add(elementMap);
                }
            }
            if (elements.size() == 0) {
                logger.error("xPath（DOM树路径）出现错误！");
            }
        }

        return elementList;
    }






}

