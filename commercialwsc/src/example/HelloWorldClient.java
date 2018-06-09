package example;

import com.intergration.demo.HelloWorldServiceLocator;
import com.intergration.demo.HelloWorld_PortType;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
      HelloWorld_PortType service = locator.getHelloWorld();
      // If authorization is required
      //((HelloWorldSoapBindingStub)service).setUsername("user3");
      //((HelloWorldSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      String res = service.sayHelloWorldFrom("Tom!");
      System.out.println(res);

      System.out.println(service.findAllCourse("44"));
      System.out.println(service.findMyCourse("99"));
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
