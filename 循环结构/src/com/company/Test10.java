package com.company;

public class Test10 {
    public static void main(String[] args) {
        // write your code here
        for(int j=1;j<=6;j++) {
            for (int i = 1; i <=6-j; i++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
