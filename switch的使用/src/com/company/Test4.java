package com.company;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入几几年");
        int years=scan.nextInt();
        System.out.println("请输入"+years+"年的month");
        int month=scan.nextInt();
        System.out.println("请输入"+years+month+"day");
        int day=scan.nextInt();
        int sumDays=0;
        switch (month){
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case  9:
                sumDays+=31;
            case  8:
                sumDays+=31;
            case  7:
                sumDays+=3;
            case  6:
                sumDays+=30;
            case  5:
                sumDays+=30;
            case  4:
                sumDays+=31;
            case  3:
                if((years%4==0 && years%100!=0) || years%400==0){
                    sumDays+=29;
                }else {
                    sumDays+=28;
                }
            case  2:
                sumDays+=31;
            case  1:
                sumDays+=day;
                break;
        }
        System.out.println(years+"年"+month+"月"+day+"日是当年的第"+sumDays+"天");
        }
    }

