package com.atguigu.java;

/**
 * @author wangxiang
 * @create 2020-12-05-17:36
 * <p>
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {

}

class Bank {//懒汉式

    private Bank() {
    }

    private static Bank instance = null;

    private static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
}

class Bank1 {//懒汉式

    private Bank1() {
    }

    private static Bank1 instance = null;

    private static synchronized Bank1 getInstance() {
        if (instance == null) {
            instance = new Bank1();
        }
        return instance;
    }
}

class Bank2 {//懒汉式

    private Bank2() {
    }

    private static Bank2 instance = null;

    private static Bank2 getInstance() {

        //效率稍差
//        synchronized (Bank2.class) {
//            if (instance == null) {
//                instance = new Bank2();
//            }
//            return instance;
//        }
//        方式二效率较高
        if (instance == null) {
            synchronized (Bank2.class) {
                if (instance == null) {
                    instance = new Bank2();
                }
            }
        }
        return instance;
    }
}