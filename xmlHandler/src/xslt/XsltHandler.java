package xslt;

import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * XML������
 * @author  zhuyingshan
 * @version 1.0
 * @created 2018/6/19
 */
public class XsltHandler {

    /**
     * ʹ��XSLTת��XML�ļ�
     * @param srcXml    ԴXML�ļ�·��
     * @param dstXml    Ŀ��XML�ļ�·��
     * @param xslt      XSLT�ļ�·��
     */
    public static void transformXmlByXslt(String srcXml, String dstXml, String xslt) {

        // ��ȡת��������
        TransformerFactory tf = TransformerFactory.newInstance();

        try {
            // ��ȡת��������ʵ��
            Transformer transformer = tf.newTransformer(new StreamSource(xslt));
            // ����ת��
            transformer.transform(new StreamSource(srcXml),
                    new StreamResult(new FileOutputStream(dstXml)));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public  static void transformXml(InputStream srcStream, OutputStream destStream, TramsformType type){
        //InputSteam in=new ByteArrayInputStream(str.getBytes()); �ַ������������
        String xsltFile="";
        switch (type){
            case COURSETOC:xsltFile="";break;
            case COURSETOM:xsltFile="";break;
            case COURSETOS:xsltFile="";break;
            case STUDENTTOC:xsltFile="";break;
            case STUDENTTOM:xsltFile="";break;
            case STUDENTTOS:xsltFile="";break;
            case SELECTIONTOC:xsltFile="";break;
            case SELECTIONTOM:xsltFile="";break;
            case SELECTIONTOS:xsltFile="";break;
            case COURSETOUNITE:xsltFile="";break;
            case STUDENTTOUNITE:xsltFile="";break;
            case SELECTIONTOUNITE:xsltFile="";break;
        }
        Source srcSource = new StreamSource(srcStream);
        Result destResult = new StreamResult(destStream);
        Source xsltSource = new StreamSource(xsltFile);

        try{
            TransformerFactory transFact = TransformerFactory.newInstance();
            Transformer trans = transFact.newTransformer(xsltSource);
            trans.transform(srcSource,destResult);
        }catch(TransformerConfigurationException e){
            e.printStackTrace();
        }catch(TransformerFactoryConfigurationError e){
            e.printStackTrace();
        }catch(TransformerException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String srcXml = "source/xml/SoftwareCourses.xml";
        String dstXml = "source/targetxml/UniteCourses.xml";
        String xslt = "source/xsl/UniteCourses.xsl";

        transformXmlByXslt(srcXml, dstXml, xslt);
    }
}
