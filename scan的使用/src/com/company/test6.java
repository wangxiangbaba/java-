package com.company;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗🐕的年龄");
        double dogAge=scan.nextDouble();
        if(dogAge<=2 && dogAge>0){
            System.out.println("狗相当于人的"+dogAge*10.5+"岁");
        }
        else if(dogAge>2){
            double newdogAge=2*10.5+(dogAge-2)*4;
            System.out.println("狗相当于人的"+newdogAge+"岁");
        }
        else{
            System.out.println("狗还未出生！");
        }
    }

}
