/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package commercial;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public String chooseCourse(String studentid, String courseid) throws java.rmi.RemoteException;
    public String findAllCourse(String nothing) throws java.rmi.RemoteException;
    public String login(String studentid, String name) throws java.rmi.RemoteException;
    public String findMyCourse(String empty) throws java.rmi.RemoteException;
    public String sayHelloWorldFrom(String from) throws java.rmi.RemoteException;
}
