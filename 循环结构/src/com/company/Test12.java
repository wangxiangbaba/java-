package com.company;

public class Test12 {
    public static void main(String[] args) {
        // write your code here
        for(int i=1;i<=10;i++) {
            if (i % 4 == 0) {
                continue;
                //break;
            }

            System.out.println(i);
        }
    }
}
