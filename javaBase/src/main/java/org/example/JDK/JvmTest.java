package org.example.JDK;

import org.example.JDK.domain.User;

public class JvmTest {

    public static final int initData = 666;

    public static User user = new User();

    public int compute(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        JvmTest jvmTest = new JvmTest();
        jvmTest.compute();
        System.out.println("end");
    }
}
