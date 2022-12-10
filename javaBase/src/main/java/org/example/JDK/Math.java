package org.example.JDK;

import org.example.JDK.domain.User;

/**
 * javap -c Math.class > Math.txt
 * javap -v Math.class > Math2.txt (更加详细)
 *
 * 栈（线程）  FILO(先进后出)
 * 局部变量表 操作数栈 动态链接 方法出口
 *
 * 方法区（元空间）
 * 常量 静态变量 类信息
 *
 */
public class Math {

    public static final int initData = 666;
    public static User user = new User();

    public int compute() { //一个方法对应一块栈帧内存区域
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute(); //常量池
    }
}
