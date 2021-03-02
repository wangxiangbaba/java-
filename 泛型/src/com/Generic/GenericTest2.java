package com.Generic;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class GenericTest2 {

    @Test
    public void test1(){
        Object obj=null;
        String str=null;

        obj=str;
    }

    @Test
    public void test2() {
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        List<String> list3=new ArrayList<>();
        list3.add("AA");
        list3.add("CC");
        list3.add("DD");
        list3.add("EE");
        list3.add("WW");

        list=list3;

//        添加：对于List<?>就不饿能向其内部添加数据
//        除了添加null之外
        list.add(null);

//        获取指定位置的数据，读取的数据类型为Object
        Object o = list.get(0);
        System.out.println(o);

    }
        public void print(List<?> list){
            Iterator<?> iterator = list.iterator();
            while(iterator.hasNext()){
                Object obj = iterator.next();
                System.out.println(obj);
            }
        }

        @Test
    public void test3(){
//        有限制条件的通配符的使用
//            ? extends Person:
//            ? super Person:

            List<? extends Order> list1=null;
            List<? super Order> list2=null;
        }
}

