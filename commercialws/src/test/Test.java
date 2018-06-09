package test;

import dataservice.CommerceService;
import dataservice.CommerceServiceImp;

/**
 * Created by ÷Ï”¶…Ω on 2018/6/9.
 */
public class Test {
    public static  void main(String []args){
        CommerceService service=new CommerceServiceImp();
        System.out.println(service.login("",""));
        //System.out.println(service.getCourseList());
       // System.out.println(service.getHistorySel(""));
        //System.out.println(service.select("",""));
    }
}
