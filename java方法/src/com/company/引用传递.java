package com.company;

public class  引用传递 {
    public static void main(String[] args) {
        People person = new People();
        System.out.println(person.name);
        引用传递.change(person);
        System.out.println(person.name);
    }
    public static void change(People person){
        person.name="王祥";
    }
}


class Person{
    String name;
}
