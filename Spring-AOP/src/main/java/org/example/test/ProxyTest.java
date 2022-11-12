package org.example.test;

import org.example.dao.Dao;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class ProxyTest {

    public static void main(String[] args) {
        byte[] bytes = ProxyGenerator.generateProxyClass("$ProxyExam",new Class[]{Dao.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:/home/$ProxyExam.class");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
