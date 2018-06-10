package dataservice;

import po.Course;
import po.LoginResult;
import po.Selection;

import java.sql.ResultSet;
import java.util.ArrayList;

public class MathServiceImp implements MathService {
    MathJDBCHelper mathJdbcHelper =new MathJDBCHelper();

    @Override
    public LoginResult login(String studentID, String studentName) {
        try {
            String queryString="select 姓名 from student where 学生编号 = "+ studentID;
            System.out.println(queryString);
            mathJdbcHelper.run(queryString);
            ResultSet set= mathJdbcHelper.pst.executeQuery();
            while(set.next()){
                String p=set.getString(1);
                if (p.equals(studentName)) {
                    return LoginResult.SUCCESS;
                }else{
                    return LoginResult.ERROR;
                }
            }
            return LoginResult.NOTEXIST;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public ArrayList<Course> getCourseList() {
        return null;
    }

    @Override
    public ArrayList<Selection> getHistorySel(String studentID) {
        return null;
    }

    @Override
    public boolean select(String studentID, String coureseID) {
        return false;
    }
}