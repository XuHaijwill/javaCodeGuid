package org.example.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 参考网址：https://book.itheima.net/course/1265899443273850881/1272721284588904449/1272772428400959491
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("org.example.reflect.Person");

        //通过反射创建对象
        Person person = (Person) aClass.newInstance();
        person.setAge(15);
        person.setName("Hello");
        System.out.println(person.toString());

        //获取Person类中指定名称的属性
        Field nameField = aClass.getDeclaredField("name");
        //设置通过反射访问该属性时取消权限检查
        nameField.setAccessible(true);
        //调用set方法为p对象的指定属性赋值
        nameField.set(person, "王小二");

        //获取Person类中指定名称的属性
        Field ageField = aClass.getDeclaredField("age");
        //设置通过反射访问该属性时取消权限检查
        ageField.setAccessible(true);
        ageField.set(person, 20);
        System.out.println(person.toString());

        //通过反射调用方法
        // 获取Person类中名为sayHello的方法，该方法有两个形参，分别为String类型和int类型
        Method md = aClass.getMethod("sayHello", String.class, int.class);
        String result = (String) md.invoke(aClass.newInstance(), "张三", 35);
        System.out.println(result);
    }
}
