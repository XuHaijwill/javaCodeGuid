package org.example.rmiSubDemo.client;

import org.example.rmiSubDemo.server.Person;

public class PersonClient {
    public static void main(String [] args) {
        try {
            Person person = new Person_Stub();
            int age = person.getAge();
            String name = person.getName();
            System.out.println(name + " is " + age + " years old");
        } catch(Throwable t) {
            t.printStackTrace();
        }
    }
}