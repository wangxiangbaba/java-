package com.atguigu.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wangxiang
 * @create 2020-12-07-21:32
 * 线程池创建线程
 */
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class NumberThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class NumberThread3 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i <=100; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
        return null;
    }
}

public class ThreadPool {
    public static void main(String[] args) {
//步骤1：提供执行线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executorService1= (ThreadPoolExecutor) executorService;
//        设置线程池的属性
        System.out.println(executorService.getClass());
        executorService1.setCorePoolSize(15);
//        executorService1.setKeepAliveTime(10,2021-12-8-21:32);
//步骤2：执行指定线程的操作，需要提供实现Runnable接口或者Callable接口实现类的对象
        executorService.execute(new NumberThread1());//适合适用于Runnable
        executorService.execute(new NumberThread2());//适合适用于Runnable
        executorService.submit(new NumberThread3());//适合适用于Callable
        executorService.shutdown();//关闭连接池
    }
}
