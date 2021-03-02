package com.atguigu.java;

/**
 * @author wangxiang
 * @create 2020-12-05-19:38
 *
 * 线程通信的例子：使用两个线程1-100，线程1，线程2，交替打印
 *
 * 设计到线程通信的三个方法：
 * wait():一旦执行此方法，当前线程就会进入阻塞状态，并且释放同步监视器锁
 * notify():一旦执行此方法，就会唤醒wait的一个线程，如果有多个线程被wait，
 * 就会唤醒优先级最高的线程
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的线程
 *
 * 说明：1.wait()，notify()，notifyAll()，三个方法必须使用在同步代码
 * 或者同步方法中
 * 2.wait()，notify()，notifyAll()三个方法的调用这必须时同步代码块
 * 或者同步方法中的同步监视器，否则会出现IllegalMonitorStateException
 * 3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中
 */
class Number implements Runnable{
    private int number=1;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                notify();
                if(number<=100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else
                {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread n1 = new Thread(n);
        Thread n2 = new Thread(n);
        n1.setName("线程1");
        n2.setName("线程2");
        n1.start();
        n2.start();
    }
}
