package com.company;

public class test1 {
    public static void main(String[] args) {
       int a= add(1,2);
       System.out.println(a);
        int b= add(1,2,3);
        double c=add(2.0,3.5);
        double d=add(2.0,3.5,9.6);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //加法
     public static int add(int a,int b){
        return a + b;
    }
    public static int add(int a,int b,int c){
        return a + b+c;
    }
    public static double add(double a,double b){
        return a + b;
    }
    public static double add(double a,double b,double c){
        return a + b+c;
    }

}
