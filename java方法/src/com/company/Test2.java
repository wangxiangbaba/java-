package com.company;

public class Test2 {
    public static void main(String[] args) {
    int a=isFlag(10,10);
    System.out.println(a);
    }
    public static int isFlag(int a,int b){
        int max=0;
        if(a==b){
            System.out.println("两数相等");
            return 0;
        }
        if(a>b){
            max=a;
        }
        else max=b;
        return max;
    }
}
