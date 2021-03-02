package com.company;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("请输入成绩");
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
       /*if(score>=60){
           System.out.println("及格");
       }
       else if(score<60){
            System.out.println("不及格");
       }*/
        switch (score/60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }
        /*switch (score/10){
            case 0://多个case执行语句相同可以合并删除留下最后一个case的执行语句
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }*/
        /*switch (score/10){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("不及格");
                break;
            case 3:
                System.out.println("不及格");
                break;
            case 4:
                System.out.println("不及格");
                break;
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("及格");
                break;
            case 8:
                System.out.println("及格");
                break;
            case 9:
                System.out.println("及格");
                break;
            case 10:
                System.out.println("及格");
                break;
        }*/
    }
}
