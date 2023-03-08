package org.example.rmi.intf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
    String hello() throws RemoteException;

}

