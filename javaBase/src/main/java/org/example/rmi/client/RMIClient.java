package org.example.rmi.client;


import org.example.rmi.intf.RMIInterface;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static org.example.rmi.server.RMIServer.RMI_NAME;


public class RMIClient {

    public static void main(String[] args) {
        try {
            // 获取服务注册器
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8099);
            // 获取所有注册的服务
            String[] list = registry.list();
            for (String i : list) {
                System.out.println("已经注册的服务：" + i);
            }

            // 寻找RMI_NAME对应的RMI实例
            RMIInterface rt = (RMIInterface) Naming.lookup(RMI_NAME);

            // 调用Server的hello()方法,并拿到返回值.
            String result = rt.hello();

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

