package org.example.rmiSubDemo.server;

public class PersonServer implements Person {
    private int age;
    private String name;

    public PersonServer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
