package sax;

import org.dom4j.*;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadComplexStudents {
    public static void main(String args[]) {
        readXmlFile("source/xml/UnitedStudent1.xml");
    }
    public static void readXmlFile(String fileName) {
        Element element = null;
        File f = new File(fileName);
        DocumentBuilder db = null; // documentBuilder为抽象不能直接实例化(将XML文件转换为DOM文件)
        DocumentBuilderFactory dbf = null;
        try {
            dbf = DocumentBuilderFactory.newInstance(); // 返回documentBuilderFactory对象
            db = dbf.newDocumentBuilder();// 返回db对象用documentBuilderFatory对象获得返回documentBuildr对象
            Document dt = db.parse(f); // 得到一个DOM并返回给document对象
            element = dt.getDocumentElement();// 得到一个elment根元素
            System.out.println("根元素：" + element.getNodeName()); // 获得根节点
            NodeList childNodes = element.getChildNodes(); // 获得根元素下的子节点
            for (int i = 0; i < childNodes.getLength(); i++) // 遍历这些子节点
            {
                Node node1 = childNodes.item(i); // childNodes.item(i);
                // 获得每个对应位置i的结点
                if ("student".equals(node1.getNodeName())) {
                    // 如果节点的名称为"Account"，则输出Account元素属性type
                    System.out.println("\r\n找到一个学生. 所属区域:s"+ node1.getAttributes().getNamedItem("type").getNodeValue() + "$$");
                    NodeList nodeDetail = node1.getChildNodes(); // 获得<Accounts>下的节点
                    for (int j = 0; j < nodeDetail.getLength(); j++) { // 遍历<Accounts>下的节点
                        Node detail = nodeDetail.item(j); // 获得<Accounts>元素每一个节点
                        if ("学号".equals(detail.getNodeName())) // 输出
                            System.out.println("学号: " + detail.getTextContent());
                        else if ("姓名".equals(detail.getNodeName())) // 输出
                            System.out.println("姓名: " + detail.getTextContent());
                        else if ("院系".equals(detail.getNodeName())) // 输出
                            System.out.println("院系: " + detail.getTextContent());

                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }





}
