package com.company;

import java.util.Scanner;

public class 简单的加减乘除 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int e= scan.nextInt();
        int r= scan.nextInt();

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int delete(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int dle(int a,int b){
        return a/b;
    }
}
