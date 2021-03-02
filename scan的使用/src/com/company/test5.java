package com.company;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        if(a>10.0 && b<20.0)System.out.println(a+b);
        else System.out.println(a*b);
    }
}
