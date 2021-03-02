package com.atguigu.java;

/**
 * @author wangxiang
 * @create 2020-12-05-17:04
 *
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 */
class window1 implements Runnable{
    private static int ticket=100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private static synchronized void show(){//同步监视器：window.class
        if(ticket>0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
            ticket--;
        }
        }
    }

public class WindowTest3 {
    public static void main(String[] args) {
        window1 w = new window1();
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

