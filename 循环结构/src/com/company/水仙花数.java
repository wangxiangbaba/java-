package com.company;

import java.util.Scanner;

public class 水仙花数 {
    public static void main(String[] args) {
        // write your code here
        int hun;
        int ten;
        int ind;
        for (int n = 100; n < 1000; n++) {
            hun=n/100;
            ten=n%100/10;
            ind=n%10;
            if (n == hun*hun*hun + ten*ten*ten + ind*ind*ind ) {
                System.out.println("水仙花数为" + n);
            }
        }
    }
}
