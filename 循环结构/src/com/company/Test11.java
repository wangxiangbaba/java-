package com.company;

public class Test11 {
    public static void main(String[] args) {
        // write your code here
        for(int j=0;j<5;j++) {
            for (int i = 0; i <4-j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <j+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=0;j<5;j++) {
            for (int i = 0; i <4-j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <j+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=0;j<4;j++) {
            for (int i = 0; i <j+1; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <4-j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
