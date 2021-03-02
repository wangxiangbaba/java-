package com.company;

public class Student extends People {
    private String name="神号";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("PEOPLE");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }

}
