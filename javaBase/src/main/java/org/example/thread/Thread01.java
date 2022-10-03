package org.example.thread;

public class Thread01 extends Thread{

    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        thread01.start();
    }

    @Override
    public void run() {
        System.out.println("Hi,I am a Thread.");
    }
}
