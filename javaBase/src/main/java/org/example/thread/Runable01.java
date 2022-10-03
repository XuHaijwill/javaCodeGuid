package org.example.thread;

public class Runable01 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi I am Runable");
    }

    public static void main(String[] args) {
        new Thread(new Runable01()).start();
    }
}
