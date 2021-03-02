package com.company;

import java.util.Scanner;

public class test8 {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的身高");
        double height=scan.nextDouble();
        System.out.println("请输入你的财富");
        double honor= scan.nextDouble();
        System.out.println("请输入你的颜值（帅 or 丑）");
        String isYanzhi=scan.next();
        if(height>=180 && honor>10000000 && isYanzhi.equals("帅")){
            System.out.println("我一定要嫁给他");
        }
        else if(height>=180 ||honor>10000000 || isYanzhi.equals("帅")) {
            System.out.println("嫁吧，比上不足比下有余");
        }
        else
        {
            System.out.println("不嫁");
        }
    }
}
