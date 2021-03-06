package datautils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import po.Course;
import po.Selection;
import po.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 朱应山 on 2018/6/10.
 */
public class parseXML {

    public ArrayList<Student> paserCommerceStudent(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        ArrayList<Student> list = new ArrayList<>();
        try {
            Document document = saxReader.read(inputXml);
            Element Students = document.getRootElement();
            for (Iterator i = Students.elementIterator(); i.hasNext(); ) {
                Element element = (Element) i.next();
                String studentID = element.elementText("sno");
                String Name = element.elementText("snm");
                String major = element.elementText("sde");
                Student student = new Student(studentID, Name, major);
                list.add(student);

            }

        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }


    public ArrayList<Selection> paserCommerceSelection(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        ArrayList<Selection> list = new ArrayList<>();
        try {
            Document document = saxReader.read(inputXml);
            Element Selections = document.getRootElement();
            for (Iterator i = Selections.elementIterator(); i.hasNext(); ) {
                Element element = (Element) i.next();
                String studentId = element.elementText("cns");
                String courseID = element.elementText("sno");
                String grade = element.elementText("grd");

                Selection selection = new Selection(studentId, courseID, Double.parseDouble(grade));
                list.add(selection);
            }

        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Course> paserCommerceCourse(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        ArrayList<Course> list = new ArrayList<>();
        try {
            Document document = saxReader.read(inputXml);
            Element Courses = document.getRootElement();
            for (Iterator i = Courses.elementIterator(); i.hasNext(); ) {
                Element element = (Element) i.next();
                String courseID = element.elementText("cno");
                String courseName = element.elementText("cnm");
                String teacher = element.elementText("tec");
                String share = element.elementText("share");
                Course course = new Course(courseID, courseName, teacher, share.charAt(0));
                list.add(course);

            }
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
