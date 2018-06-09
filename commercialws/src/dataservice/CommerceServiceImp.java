package dataservice;

import po.Course;
import po.LoginResult;
import po.Selection;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by ��Ӧɽ on 2018/6/9.
 */
public class CommerceServiceImp implements CommerceService {
    JDBCHelper jdbcHelper=new JDBCHelper();
    /**
     * �򵥵ĵ�¼����֤���
     *
     * @param studentID   ѧ��ID
     * @param studentName ѧ������
     * @return ��¼�������������
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
     * ���Ժϵ���пγ�
     *
     * @return Ժϵ���еĿγ�
     */
    @Override
    public ArrayList<Course> getCourseList() {
        return null;
    }

    /**
     * ���ѧ���ڱ�Ժ������ѡ�μ�¼
     *
     * @param studentID
     * @return
     */
    @Override
    public ArrayList<Selection> getHistorySel(String studentID) {
        return null;
    }

    /**
     * ѡ�β�������ѡ���б���������Ŀ��������ʼֵΪ0
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
