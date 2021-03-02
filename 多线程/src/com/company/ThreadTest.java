package com.company;

/**
 * @author wangxiang
 * @create 2020-12-02-20:12
 * 多线程的创建
 * 方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()-->此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 * 例子：遍历100以内的所有的偶数
 */
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
//        创建子类的对象
        MyThread t1 = new MyThread();
//        通过此对象调用start():1.启动当前线程   2.调用当前线程的run()
        t1.start();
    }
}
