package com.Set;

import com.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangxiang
 * @create 2020/12/25
 *
 * 向TreeSet中添加的数据，要求是相同类的对象
 * 两种排序方式：自然排序 定制排序
 * 自然排序中，比较两个对象是否相同的标准为：compareTo()返回值为0，不再是equals()
 * 定制排序：比较两个对象是否相同的标准为：compare()返回值是0，不再是equals()
 */
public class Treeset {
    @Test
    public void test1(){
        Set set=new TreeSet();
        set.add(456);
        set.add(123);
        set.add(121);
        set.add(131);
        set.add(25);

        for(Object obj:set){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        Comparator com=new Comparator() {
            @Override
//            按照年龄从小到大排列
            public int compare(Object o1, Object o2) {
               if(o1 instanceof Person && o2 instanceof Person ){
                   Person p1=(Person)o1;
                   Person p2=(Person)o2;
                   return Integer.compare(p1.getAge(),p2.getAge());
               }else {
                   throw new RuntimeException("输入类型不匹配");
               }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new Person("TOM",12));
        set.add(new Person("Taix",13));
        set.add(new Person("jack",56));
        set.add(new Person("new",59));
        set.add(new Person("theshy",25));


        for(Object obj:set){
            System.out.println(obj);
        }


    }
}



















