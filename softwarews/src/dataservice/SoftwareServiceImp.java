package dataservice;

import po.Course;
import po.LoginResult;
import po.Selection;

import java.util.ArrayList;

public class SoftwareServiceImp implements SoftwareService {

    @Override
    public LoginResult login(String studentID, String studentName) {
        return null;
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
