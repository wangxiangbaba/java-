package com.Set;

import com.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author wangxiang
 * @create 2020/12/25
 *
 * HashSet:作为Set接口的主要实现类,线程不安全，可以存储null值
 * LinkedHashSet:HashSet的子类，遍历其内部数据时可以按照添加的顺序遍历
 * TreeSet:可以按照添加元素，对象的指定属性，进行排序
 *
 * Set接口中没有额外定义新的方法，使用的都是Collection中声明过的方法
 *
 * Set
 *  无序性：不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加。
 *  而是根据数据的哈希值确定的
 *  不可重复性：保证添加的元素按照equals方法判断时，不能返回true。即相同的元素
 *  只能添加一个
 *
 *  要求：向Set中添加数据，其所在的类一定要重写hashCode()和equals()
 *  要求：重写的hashCode()和equals()尽可能保持一致性：相等的对象bi必须具有相等的散列码
 *
 */
public class SetTest {
    @Test
    public void test1(){
        Set set=new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add(new Person("TOM",12));
        set.add(new Person("TOM",12));
        set.add("cc");
        set.add(123);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Object obj:set){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        Set set=new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add(new Person("TOM",12));
        set.add(new Person("TOM",12));
        set.add("cc");
        set.add(123);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Object obj:set){
            System.out.println(obj);
        }


    }
}
