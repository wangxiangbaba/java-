package com.company;

/**
 * @author wangxiang
 * @create 2020-12-03-15:25
 * 练习：创建两个分线程，其中一个线程遍历10.以内的偶数，另一个线程遍历100以内的奇数
 */
 class T1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
 class T2 extends Thread{
     @Override
     public void run() {
         for (int i = 0; i < 100; i++) {
             if(i%2!=0){
                 System.out.println(Thread.currentThread().getName()+":"+i);
             }
         }
     }
}


 public class Test1{
     public static void main(String[] args) {
         T1 t1=new T1();
         T2 t2=new T2();
         t1.start();
         t2.start();
         //创建T1类的匿名子类
         new Thread(){
             @Override
             public void run() {
                 for (int i = 0; i < 100; i++) {
                     if(i%2!=0){
                         System.out.println(Thread.currentThread().getName()+":"+i);
                     }
                 }
             }
         }.start();
     }
}