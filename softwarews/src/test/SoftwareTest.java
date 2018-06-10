package test;

import dataservice.SoftwareService;
import dataservice.SoftwareServiceImp;

public class SoftwareTest {

    public static void main(String[] args){
        SoftwareService service=new SoftwareServiceImp();
        System.out.println(service.login("151250001","戚蓉"));
    }
}