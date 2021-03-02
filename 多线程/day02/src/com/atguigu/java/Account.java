package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangxiang
 * @create 2020-12-05-19:03
 * <p>
 * 银行有一个账户，有两个储户分别向同一个账户存3000元，
 * 每次存1000，存三次，每次存完打印账户余额
 */
class AccountTest implements Runnable {
    private double account=0;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                    account += 1000;
                    System.out.println(Thread.currentThread().getName() + account);
                }

        } finally {
            lock.unlock();
        }
    }
}

public class Account {
    public static void main(String[] args) {
        AccountTest a = new AccountTest();
        Thread a1 = new Thread(a);
        Thread a2 = new Thread(a);
        a1.setName("甲");
        a2.setName("乙");
        a1.start();
        a2.start();
    }
}
