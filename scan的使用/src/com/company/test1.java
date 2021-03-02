package com.company;
import java.util.Scanner;
class test1 {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();

        String name = scan.next();
        System.out.println(num);
        System.out.println(name);
        System.out.println("你是男的还是不是男的?(true/false)");
        boolean islove = scan.nextBoolean();
        System.out.println(islove);
        System.out.println("请输入一个单词");
        String gender=scan.next();
        char genderChar=gender.charAt(2);
        System.out.println(genderChar);
    }
}
