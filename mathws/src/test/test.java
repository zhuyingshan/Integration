package test;

import dataservice.MathService;
import dataservice.MathServiceImp;

public class test {

    public static final void main(String[] args){
        MathService service=new MathServiceImp();
        System.out.println(service.login("151350001","赵瑶"));
    }
}