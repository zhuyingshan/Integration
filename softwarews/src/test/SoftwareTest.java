package test;

import dataservice.MathService;
import dataservice.MathServiceImp;

public class SoftwareTest {

    public static final void main(String[] args){
        MathService service=new MathServiceImp();
        System.out.println(service.login("",""));
    }
}