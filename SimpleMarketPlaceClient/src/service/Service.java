/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface Service extends java.rmi.Remote {
    public java.lang.String signIn(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String signUp(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
}
