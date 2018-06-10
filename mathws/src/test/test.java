package test;

import dataservice.MathService;
import dataservice.MathServiceImp;

public class test {

    public static final void main(String[] args){
        MathService service=new MathServiceImp();
        //System.out.println(service.login("151350001","赵瑶"));
        //System.out.println(service.getCourseList().get(0).courseId);
        /*System.out.println(service.getHistorySel("151350001").get(0).studentId
                + "  " +service.getHistorySel("151350001").get(0).courseId);
                */
        //System.out.println(service.select("151350001","15130001"));
    }
}