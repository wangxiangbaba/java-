package com.Generic;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class GenericTest1 {
    public void test1(){
//        如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
//        要求：如果大家定义了类是带泛型的，建议在实例化时指明类的泛型
        Order order = new Order();
        order.setOrderT(1230);
        order.setOrderT("AA");

        Order<String> order1 = new Order<>("AA",1001,"ROSE");

//        由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，
//        不再需要指明泛型
        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(123);

        SubOrder1<String> sub1 = new SubOrder1<>();
        sub1.setOrderT("AA");

    }


}
