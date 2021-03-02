package com.company;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("请输入单个字母");
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
          char  c=word.charAt(0);
          switch (c){
              case 'a':
                  System.out.println("A");
                  break;
              case 'b':
                  System.out.println("B");
                  break;
              case 'c':
                  System.out.println("C");
                  break;
              case 'd':
                  System.out.println("D");
                  break;
              case 'e':
                  System.out.println("E");
                  break;
              default:
                  System.out.println("other");
                  break;


          }
    }
}
