package com.company;

public class 值传递 {
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);
        值传递.change(a);
        System.out.println(a);
    }
    public static void change(int a ){
        a=10;
    }
}
