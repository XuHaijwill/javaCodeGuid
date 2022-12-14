package org.example.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulePoolTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(10);
       /*  scheduledExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("悟空是只猴子");
            }
        });*/
        scheduledExecutorService.schedule(()->{
            System.out.println("5");
        },5,TimeUnit.SECONDS);

        /*scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                    System.out.println("悟空是只猴子");
              //  throw new RuntimeException(); //有异常了就不会在执行了

            }
        },0,5, TimeUnit.SECONDS);*/


      /*  scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                System.out.println("悟空是只猴子");
                //  throw new RuntimeException(); //有异常了就不会在执行了

            }
        },0,5, TimeUnit.SECONDS);
*/
    }
}

