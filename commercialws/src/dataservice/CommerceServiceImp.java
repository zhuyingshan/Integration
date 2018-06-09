package dataservice;

import po.Course;
import po.LoginResult;
import po.Selection;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by 朱应山 on 2018/6/9.
 */
public class CommerceServiceImp implements CommerceService {
    JDBCHelper jdbcHelper=new JDBCHelper();
    /**
     * 简单的登录，验证结果
     *
     * @param studentID   学生ID
     * @param studentName 学生姓名
     * @return 登录结果，包括三种
     */
    @Override
    public LoginResult login(String studentID, String studentName) {
        try {
            String queryString="select snm from student where sno =\""+studentID +"\";";
            System.out.println(queryString);
            jdbcHelper.run(queryString);
            ResultSet set=jdbcHelper.pst.executeQuery();
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

    /**
     * 获得院系所有课程
     *
     * @return 院系所有的课程
     */
    @Override
    public ArrayList<Course> getCourseList() {
        return null;
    }

    /**
     * 获得学生在本院的所有选课记录
     *
     * @param studentID
     * @return
     */
    @Override
    public ArrayList<Selection> getHistorySel(String studentID) {
        return null;
    }

    /**
     * 选课操作，在选课列表中新增项目，分数初始值为0
     *
     * @param studentID
     * @param coureseID
     * @return
     */
    @Override
    public boolean select(String studentID, String coureseID) {
        return false;
    }
}
