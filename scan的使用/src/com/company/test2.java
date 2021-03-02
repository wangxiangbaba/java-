package com.company;

import java.util.Scanner;

public class test2 {
        public static void main(String[] args) {
            // write your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入整数n1");
            int n1 = scan.nextInt();
            System.out.println("请输入整数n2");
            int n2 = scan.nextInt();
            System.out.println("请输入整数n3");
            int n3 = scan.nextInt();
            if (n1 <= n2) {

                if (n3 >= n2)
                    System.out.println(n1 + "," + n2 + "," + n3);
                 else if (n3 <= n1)
                    System.out.println(n3 + "," + n1 + "," + n2);
                 else
                    System.out.println(n1 + "," + n3 + "," + n2);

            } else if (n1 >= n2) {

                if (n3 <= n2)
                    System.out.println(n3 + "," + n2 + "," + n1);
                 else if (n3 >= n1)
                    System.out.println(n2 + "," + n1 + "," + n3);
                 else
                    System.out.println(n2 + "," + n3 + "," + n1);
            }
        }

        }
