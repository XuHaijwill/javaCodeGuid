package org.example.rmi.intf.impl;

import org.example.rmi.intf.RMIInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RMIImpl extends UnicastRemoteObject implements RMIInterface {

    public RMIImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello() throws RemoteException {
        System.out.println("call hello().");
        return "this is hello().";
    }

}