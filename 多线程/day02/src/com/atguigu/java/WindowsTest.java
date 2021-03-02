package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangxiang
 * @create 2020-12-03-19:24
 *
 * 解决线程安全问题的方式三：Lock锁--》JDK5.0新增
 */

class wiodow implements Runnable{
    private int ticket=100;
    //第一步实例化ReentrantLock
    private ReentrantLock lock=new ReentrantLock();//ctrl+p选择构造器

    @Override
    public void run() {
        while(true){
            try {
                //第二部调用锁定lock方法
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //第三步调用解锁unlock()的方法
                lock.unlock();
            }
        }
    }
}

public class WindowsTest {
    public static void main(String[] args) {
        wiodow w = new wiodow();
        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);
        Thread w3 = new Thread(w);
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w3.start();
        w2.start();

    }
}
