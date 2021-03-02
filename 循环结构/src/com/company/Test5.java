package com.company;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入m");
        int m=scan.nextInt();
        System.out.println("请输入n");
        int n=scan.nextInt();
        int min=(m<=n)?m:n;
        for(int i=min;i>=1;i--){
            if(m%i==0 && n%i==0){
                System.out.println("最大公约数为"+i);
                break;
            }
        }
        int max=(m>=n)?m:n;
        for(int i=max;i<=m*n;i++){
            if(i%m==0 && i%n==0){
                System.out.println("最小公倍数为"+i);
                break;
            }
        }
    }
}
