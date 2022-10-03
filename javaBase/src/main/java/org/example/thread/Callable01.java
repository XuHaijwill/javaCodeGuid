package org.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable01 implements Callable {
    @Override
    public Object call() throws Exception {
        return "Hi i am Callable";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask<>(new Callable01());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
