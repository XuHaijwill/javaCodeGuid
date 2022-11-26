package org.example.jul;

/**
 * -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -Xcomp
 * Could not load hsdis-amd64.dll; library not loadable; PrintAssembly is disabled
 *
 * https://www.jianshu.com/p/9c7020c751a8
 * 整到hisdis-amd64.dll之后丢到jre/bin/server目录里就完事了
 *
 * https://dropzone.nfshost.com/hsdis/
 */
public class VisibilityTest {

    //storeLoad JVM内存屏障 ---> 汇编层面指令 Lock;addl $0,0(%%rep)
    //lock 前缀质量不是内存屏障的指令，但是有内存屏障的效果 缓存失效
    private boolean flag = true;

    //3. 可以跳出循环
//    private Integer count = 0;

    //1.volatile 跳出循环
//    private volatile boolean flag = true;

    public void refresh() {
        flag = false;
        System.out.println(Thread.currentThread().getName() + "修改flag");
    }

    public void load() {
        System.out.println(Thread.currentThread().getName() + "开始执行.....");
        int i = 0;
        while (flag) {
            i++;
//            count++;
            //TODO 业务逻辑

            //5.能够跳出循环 释放时间片 上下文切换 加载上下文
            //线程上下文切换 5-10ms
            Thread.yield();
            //2.能够跳出循环
//            System.out.println();

            //4.刷新线程本地复制缓存
//            shortWait(1000000);//1ms
        }
        System.out.println(Thread.currentThread().getName() + "跳出循环: i=" + i);
    }

    public static void main(String[] args) throws InterruptedException {
        VisibilityTest test = new VisibilityTest();

        // 线程threadA模拟数据加载场景
        Thread threadA = new Thread(() -> {
            test.load();
        }, "threadA");
        threadA.start();

        // 让threadA执行一会儿
        Thread.sleep(1000);
        // 线程threadB通过flag控制threadA的执行时间
        Thread threadB = new Thread(() -> {
            test.refresh();
        }, "threadB");
        threadB.start();

    }


    public static void shortWait(long interval) {
        long start = System.nanoTime();
        long end;
        do {
            end = System.nanoTime();
        } while (start + interval >= end);
    }
}
