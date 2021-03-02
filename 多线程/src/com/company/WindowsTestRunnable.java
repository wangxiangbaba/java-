package com.company;

/**
 * @author wangxiang
 * @create 2020-12-03-19:54
 * 例子：创建三个窗口卖票，总票数为100张  使用Runnable方法
 * <p>
 * 问题1：卖票过程中出现了重票，错票--》出现了线程的安全问题
 * <p>
 * 问题出现的原因：当某个线程操作车票的过程中，
 * 尚未操作完成时，其他线程参与进来，也来操作车票
 * <p>
 * 如何解决？    当一个线程在操作ticket的时候，其他线程不能参与进来，直到
 * 线程a操作完的时候，其他线程才开始操作ticket，这种情况即使线程a出现了阻塞，
 * 也不能被改变
 * <p>
 * 在java中，我们通过同步机制，来解决线程的安全问题
 * <p>
 * 方法一：同步代码块
 * 关键字：synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * 说明：操作共享数据的代码，就是需要被同步的代码
 * 共享数据：多个线程共同操作的变量，比如：ticket就是共享数据1
 * 同步监视器：俗称：锁  任何一个类的对象都可以来充当锁
 * 要求：多个线程必须要公用同一把锁🔒
 * 补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器
 * 在继承Thread类创建多线程的方式中，慎用this充当同步监视器，
 * 可以考虑使用当前类充当同步监视器  XX.class
 *
 *
 *
 * 方法二：同步方法：如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法
 * 声明同步的
 *
 * 关于同步方法的总结：
 *      1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 *      2.非静态的同步方法，同步监视器是this
 *      3.静态的同步方法，同步监视器是当前类本身
 *
 * 同步的方式：解决了线程的安全问题，但是操作同步代码时，
 * 只能有一个线程参与，其他线程等待，相当于是一个单线程的过程，效率低
 */
class Window1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Window1.class) {//对象唯一就可用this指向当前唯一对象w1或者  Window1.class
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

public class WindowsTestRunnable {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("线程1：");
        t2.setName("线程2：");
        t3.setName("线程3：");
        t1.start();
        t2.start();
        t3.start();
    }
}
