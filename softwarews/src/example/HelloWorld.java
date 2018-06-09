package example;

import net.sf.json.JSONArray;
import po.Course;
import po.Grade;
import po.LoginResult;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);

      List<Course> list = new ArrayList<>();
      Course course = new Course();
      course.setCourseId("111");
      course.setCourseName("测试");
      course.setIsShare('f');
      course.setTeacher("嘿嘿");
      list.add(course);

      System.out.println(JSONArray.fromObject(list).toString());
    return result;
  }

  public String login(String studentid, String name) {
    return String.valueOf(LoginResult.SUCCESS);
  }

  public String chooseCourse(String studentid, String courseid) {
    return String.valueOf(LoginResult.NOTEXIST);
  }

  public String findAllCourse(String nothing) {

      List<Course> list = new ArrayList<>();
    Course course = new Course();
    course.setCourseId("111");
    course.setCourseName("测试");
    course.setIsShare('f');
    course.setTeacher("嘿嘿");
    list.add(course);

    return JSONArray.fromObject(list).toString();
  }

  public String findMyCourse(String empty) {
    List<Grade> list = new ArrayList<>();

    Grade grade = new Grade();
    grade.setCourseId("111");
    grade.setStudentId("444");
    grade.setGrade(66);

    list.add(grade);

    return JSONArray.fromObject(list).toString();
  }
}
