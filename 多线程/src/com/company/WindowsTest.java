package com.company;

/**
 * @author wangxiang
 * @create 2020-12-03-19:24
 * 例子：创建三个窗口卖票，总票数为100张
 */

class window extends Thread{
    private static  int ticket=100;
    private static Object obj=new Object();
    @Override
    public void run() {
        while(true) {
            synchronized (window.class) {//可用obj或者window.class
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
            }
        }
    }
}
public class WindowsTest {
    public static void main(String[] args) {
        window w1 = new window();
        window w2 = new window();
        window w3 = new window();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w3.start();
        w2.start();

    }
}
