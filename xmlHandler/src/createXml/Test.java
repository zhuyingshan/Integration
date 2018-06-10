package createXml;

import po.Course;
import sax.Dom4jDemo;

import java.util.ArrayList;

/**
 * Created by 朱应山 on 2018/6/10.
 */
public class Test {
    public static  void main(String args[]){
        Dom4jDemo dom4jDemo=new Dom4jDemo();
        ArrayList<Course> list=dom4jDemo.parserXml("source/xml/CommerceCourses.xml");
        CreateCommerceXML.CoursesXML(list);
    }
}
