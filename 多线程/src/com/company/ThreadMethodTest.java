package com.company;

/**
 * @author wangxiang
 * @create 2020-12-03-15:45
 * 测试Thread的常用方法
 * 1.strat():启动当前线程，调用当前线程的run()方法
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权，cpu被哪个线程抢到是随机的
 * 7.join():在线程a中调用线程b中的join()方法，此时线程a就进入阻塞状态，
 * 直到线程b完全执行完以后，线程a才结束阻塞状态
 * 8.stop():已过时。当执行此方法时，强制结束当前线程
 * 9.sleep(long millitime):让当前线程睡眠指定millitime毫秒，
 * 在指定的millitime毫秒内，当前线程时阻塞状态
 * 10.isAlive():判断当前线程是否存活
 *
 * 线程的优先级
 * 1.MAX_PRIORITY:10
 * 2.MIN_PRIORITY:1
 * 3.NORM_PRIORITY:5  默认优先级
 *
 * 如何获取和设置当前线程的优先级：
 * getPriority():获取优先级
 * setPriority(int x):设置优先级
 * 高优先级的线程要抢占低优先级的cpu执行权，但是只是从概率上讲，高优先级的线程高概率被
 * 执行并不意味着只有当高优先级的线程执行完后，低优先级才执行
 *
 */
class HellpThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + ":" +Thread.currentThread().getPriority()+":"+ i);
            }
//            if (i % 20 == 0) {
//                yield();
//            }
//            if(i==43){
//                stop();
//            }
        }
    }
    public HellpThread(String name){//利用构造器给线程取名
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        HellpThread h1 = new HellpThread("Thread:1");
//        h1.setName("线程1");
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if(i%2==0) {
                System.out.println(Thread.currentThread().getName() + ":" +Thread.currentThread().getPriority()+":"+ i);
            }
//            if(i==20){
//                try {
//                    h1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
//        System.out.println(h1.isAlive());
    }
}
