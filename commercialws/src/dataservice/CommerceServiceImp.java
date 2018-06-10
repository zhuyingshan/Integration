package dataservice;

import jdk.nashorn.internal.runtime.ECMAException;
import po.Course;
import po.LoginResult;
import po.Selection;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
<<<<<<< HEAD
 * Created by ��Ӧɽ on 2018/6/9.
 */
public class CommerceServiceImp implements CommerceService {
    JDBCHelper JDBCHelper =new JDBCHelper();
    /**
     * �򵥵ĵ�¼����֤���
     *
     * @param studentID   ѧ��ID
     * @param studentName ѧ������
     * @return ��¼�������������
=======
 * Created by 朱应山 on 2018/6/9.
 */
public class CommerceServiceImp implements CommerceService {
    JDBCHelper jdbcHelper = new JDBCHelper();

    /**
     * 简单的登录，验证结果
     *
     * @param studentID   学生ID
     * @param studentName 学生姓名
     * @return 登录结果，包括三种
>>>>>>> d3f931dad5a8d8677a79de83715ac4e1d5f4e911
     */
    @Override
    public LoginResult login(String studentID, String studentName) {
        try {
            String queryString = "select snm from student where sno =\"" + studentID + "\";";
            System.out.println(queryString);
<<<<<<< HEAD
            JDBCHelper.run(queryString);
            ResultSet set= JDBCHelper.pst.executeQuery();
            while(set.next()){
                String p=set.getString(1);
=======
            jdbcHelper.run(queryString);
            ResultSet set = jdbcHelper.pst.executeQuery();
            while (set.next()) {
                String p = set.getString(1);
>>>>>>> d3f931dad5a8d8677a79de83715ac4e1d5f4e911
                if (p.equals(studentName)) {
                    return LoginResult.SUCCESS;
                } else {
                    return LoginResult.ERROR;
                }
            }
            return LoginResult.NOTEXIST;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("发生错误");
        return LoginResult.ERROR;
    }

    /**
<<<<<<< HEAD
     * ���Ժϵ���пγ�
     *
     * @return Ժϵ���еĿγ�
=======
     * 获得院系所有课程
     *
     * @return 院系所有的课程
>>>>>>> d3f931dad5a8d8677a79de83715ac4e1d5f4e911
     */
    @Override
    public ArrayList<Course> getCourseList() {
        ArrayList<Course> list = new ArrayList<>();
        try {
            String queryString = "select * from course;";
            System.out.println(queryString);
            jdbcHelper.run(queryString);
            ResultSet set = jdbcHelper.pst.executeQuery();
            while (set.next()) {
                String courseID = set.getString(1);
                String courseName = set.getString(2);
                String teacher = set.getString(3);
                char share = set.getString(4).charAt(0);
                Course course = new Course(courseID, courseName, teacher, share);
                list.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
<<<<<<< HEAD
     * ���ѧ���ڱ�Ժ������ѡ�μ�¼
=======
     * 获得学生在本院的所有选课记录
>>>>>>> d3f931dad5a8d8677a79de83715ac4e1d5f4e911
     *
     * @param studentID
     * @return
     */
    @Override
    public ArrayList<Selection> getHistorySel(String studentID) {
        ArrayList<Selection> list = new ArrayList<>();
        try {
            String queryString = "select *from selection where sno=\"" + studentID + "\";";
            jdbcHelper.run(queryString);
            ResultSet set = jdbcHelper.pst.executeQuery();
            while (set.next()) {
                String cno = set.getString(1);
                String sno = set.getString(2);
                double grade = set.getDouble(3);
                Selection selection = new Selection(cno, sno, grade);
                list.add(selection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
<<<<<<< HEAD
     * ѡ�β�������ѡ���б���������Ŀ��������ʼֵΪ0
=======
     * 选课操作，在选课列表中新增项目，分数初始值为0
>>>>>>> d3f931dad5a8d8677a79de83715ac4e1d5f4e911
     *
     * @param studentID
     * @param coureseID
     * @return
     */
    @Override
    public boolean select(String studentID, String coureseID) {
        try {
            Selection selection = new Selection(studentID, coureseID);
            String addString = " insert into selection values(\"" + selection.courseId
                    + "\",\"" + selection.studentId + "\",\"" + selection.grade + "\");";
            jdbcHelper.run(addString);
            int result=jdbcHelper.pst.executeUpdate();
            if(result!=0){
                return  true;
            }else{
                return  false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
