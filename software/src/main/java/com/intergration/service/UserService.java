package com.intergration.service;

import com.intergration.model.LoginResult;
import com.intergration.model.po.CoursePo;
import com.intergration.model.po.UserPo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 朱应山 on 2018/6/1.
 */
@Service
public interface UserService {
    /**
     * 软件学院学生进行登录
     * @param studentID
     * @param name
     * @return
     */
    public LoginResult login(String studentID,String name);

    /**
     * 获得学生的个人信息，包括已选课程列表
     * @param studentID
     * @return
     */
    public UserPo getUserPo(String studentID );

    /**
     * 获得课程列表
     * @return
     */
    public ArrayList<CoursePo> getCourseList();

    /**
     * 选课操作
     * @param studentID
     * @return
     */
    public boolean select(ArrayList<CoursePo> courseList,String studentID);

    /**
     * 退选课程操作
     * @param studentID
     * @return
     */
    public boolean cancel(ArrayList<CoursePo>courseList,String studentID);
}
