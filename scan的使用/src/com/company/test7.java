package com.company;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        // write your code here
        int number=(int)(Math.random()*90+10);
        int numberA=number/10;
        int numberB=number%10;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数（整数类型10~99）");
        int guess=scan.nextInt();
        int guess1=guess/10;
        int guess2=guess%10;

        System.out.println("彩票奖号为："+number);
        if(guess1==numberA && guess2==numberB){
            System.out.println("奖金10000元");
        }
        else if(guess2==numberA && guess1==numberB){
            System.out.println("奖金3000元");
        }
        else if(guess1==numberA || guess2==numberB) {
            System.out.println("奖金1000元");
        }
        else if(guess1==numberA || guess1==numberB) {
            System.out.println("奖金500元");
        }
        else if(guess2==numberA || guess2==numberB) {
            System.out.println("奖金500元");
        }
        else if(guess1!=numberA || guess2!=numberB) {
            System.out.println("彩票作废！");
        }
        else if(guess2!=numberA || guess1!=numberB) {
            System.out.println("彩票作废！");
        }
    }
}
