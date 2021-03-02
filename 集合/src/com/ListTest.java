package com;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/25
 *
 * ArrayList:作为List接口的主要实现类，线程不安全，所以效率高，
 * 底层使用Object[] elementDate存储
 * LinkedList:底层使用双向链表存储，对于频繁的插入，删除操作，使用此类效率比ArrayList
 * 效率高
 * Vector:作为List接口的古老实现类，线程安全，效率低，
 * 底层使用Object[] elementDate存储
 *
 */
public class ListTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("TOM",23));
        list.add(456);

        System.out.println(list);

//
        list.add(1,"BB");//在1的位置插入BB
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(1));

//        如果不存在返回-1
        int i = list.indexOf(456);
        System.out.println(i);

        int i1 = list.lastIndexOf(456);
        System.out.println(i1);

//        remove(index);删除index位置上的元素
        Object remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);

        List list2 = list.subList(2, 4);
        System.out.println(list2);


    }

}
