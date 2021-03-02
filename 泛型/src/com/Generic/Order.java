package com.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class Order<T> {
    String orderName;
    int orderId;
//       类的内部结构就可以使用类的泛型

    T orderT;
    public Order(){};

    public Order(String orderName,int orderId,T orderT){
        this.orderId=orderId;
        this.orderName=orderName;
        this.orderT=orderT;
    }

    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT=orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    public static <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }
        return list;
    }





}
