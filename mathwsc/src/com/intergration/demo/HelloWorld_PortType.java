/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.intergration.demo;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public java.lang.String sayHelloWorldFrom(java.lang.String from) throws java.rmi.RemoteException;
    public java.lang.String findAllCourse(java.lang.String nothing) throws java.rmi.RemoteException;
    public java.lang.String chooseCourse(java.lang.String studentid, java.lang.String courseid) throws java.rmi.RemoteException;
    public java.lang.String findMyCourse(java.lang.String empty) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String studentid, java.lang.String name) throws java.rmi.RemoteException;
}
