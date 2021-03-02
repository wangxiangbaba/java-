package com;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangxiang
 * @create 2020/12/26
 */
public class CollectionsTest {
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(-123);
        list.add(99);
        list.add(15);
        list.add(765);
        list.add(2);

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);

        Collections.swap(list,1,2);
        System.out.println(list);

//        返回的list1就是安全的线程
        List list1 = Collections.synchronizedList(list);

    }
}
