package com.company;

public class Application {


    public static void main(String[] args) {
        People people = new People("王祥");
        System.out.println(people.name);
        Student s1 = new Student();
        s1.setName("王祥");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
