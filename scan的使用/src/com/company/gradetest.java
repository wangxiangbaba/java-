package com.company;

import java.util.Scanner;

public class gradetest {
    public static void main(String[] args) {
        // write your code here
        System.out.println("请输入越小彭的成绩");
        Scanner scan=new Scanner(System.in);
                int grade=scan.nextInt();
                if(grade==100){
                    System.out.println("奖励一辆BWM");
                }
                else if(grade>80 && grade<=99){
                    System.out.println("奖励一台苹果XS");
                }
                else if(grade>=60 && grade<=80){
                    System.out.println("奖励一台IPAD");
                }
                else{
                    System.out.println("什么都没有");
        }
    }
}
