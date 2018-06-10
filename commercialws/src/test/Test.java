package test;

import dataservice.CommerceService;

/**
 * Created by 朱应山 on 2018/6/9.
 */
public class Test {
    public static  void main(String []args){
        CommerceService service=new CommerceServiceImp();
       /* System.out.println(service.login("151450002","左香秀"));

        System.out.println(service.login("151450002","杨寒雁"));

        System.out.println(service.login("151250214","杨寒雁"));*/
        //System.out.println(service.getCourseList().get(0).courseId);
      /*System.out.println(service.getHistorySel("151450001").get(0).studentId
              + "  " +service.getHistorySel("151450001").get(0).courseId);*/
        System.out.println(service.select("151450001","15140001"));
    }
}
