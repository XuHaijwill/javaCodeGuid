package org.example.rmi.server;

import org.example.rmi.intf.RMIInterface;
import org.example.rmi.intf.impl.RMIImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Java RMI原理及反序列化学习
 * https://y4er.com/posts/java-rmi/
 */
public class RMIServer {

    public static String HOST = "127.0.0.1";
    public static int PORT = 8099;
    public static String RMI_PATH = "/hello";
    public static final String RMI_NAME = "rmi://" + HOST + ":" + PORT + RMI_PATH;

    public static void main(String[] args) {
        // 注册RMI端口
        try {
            Registry registry = LocateRegistry.createRegistry(PORT);

            // 创建一个服务
            RMIInterface rmiInterface = new RMIImpl();

            // 服务命名绑定
            registry.bind("hello", rmiInterface);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main2(String[] args) {
        // 注册RMI端口
        try {
            LocateRegistry.createRegistry(PORT);

            // 创建一个服务
            RMIInterface rmiInterface = new RMIImpl();

            // 服务命名绑定
//            Naming.rebind(RMI_NAME, rmiInterface);
            Naming.rebind(RMI_NAME, rmiInterface);
        } catch (RemoteException | MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
