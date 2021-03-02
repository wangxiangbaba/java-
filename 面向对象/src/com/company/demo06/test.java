package com.company.demo06;

public class test {
    public static void main(String[] args) {
        try {
            new test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
    public void test(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
