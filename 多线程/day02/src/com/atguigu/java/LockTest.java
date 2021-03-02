package com.atguigu.java;

/**
 * @author wangxiang
 * @create 2020-12-05-18:28
 *
 * 解决线程安全问题的方式三：Lock锁-----JKD5.0新增
 */
class window implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":售票，票号为："+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        window w = new window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
