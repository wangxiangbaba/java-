package com.MapTest;

import com.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author wangxiang
 * @create 2020/12/26
 */
public class TreeMapTest {
    @Test
    public void test1() {
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1=(Person)o1;
                    Person p2=(Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        Person p1 = new Person("TOM", 12);
        Person p2 = new Person("Jack", 13);
        Person p3 = new Person("ROSE", 25);
        Person p4 = new Person("David", 58);
        map.put(p1, 95);
        map.put(p2, 60);
        map.put(p3, 85);
        map.put(p4, 35);

        Set set = map.entrySet();
        for(Object obj:set){
            System.out.println(obj);
        }


    }
}
