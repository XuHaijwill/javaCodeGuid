package org.example.jul.sync;


import org.example.annotation.ThreadNoSafe;

/***
 * 非线程安全的
 */
@ThreadNoSafe
public class Sync01 implements Runnable {
    static int i = 0;

    @Override
    public void run() {
        //重构
        add();
    }

    private synchronized void add() {
        for (int j = 0; j < 10000; j++) {
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        Sync01 sync01 = new Sync01();
  /*  IntStream.range(0,2).forEach(i->new Thread(sync01){
    }.start());*/


        Thread thread = new Thread(sync01);
        Thread thread2 = new Thread(sync01);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(i);


    }


}
