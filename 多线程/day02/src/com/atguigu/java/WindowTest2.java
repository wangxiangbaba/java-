package com.atguigu.java;

/**
 * @author wangxiang
 * @create 2020-12-05-16:48
 * <p>
 * 使用同步方法来实现Runnable接口的线程安全问题
 */
class Window2 implements Runnable {
    private int ticket = 100;

    @Override
    public synchronized void run() {
        while (true) {
        show();
        }
    }
    private synchronized void show(){//同步监视器就是this默认this
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w2 = new Window2();
        Thread t1 = new Thread(w2);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w2);
        t1.setName("线程1：");
        t2.setName("线程2：");
        t3.setName("线程3：");
        t1.start();
        t2.start();
        t3.start();
    }
}

