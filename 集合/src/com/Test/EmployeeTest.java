package com.Test;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author wangxiang
 * @create 2020/12/26
 */
public class EmployeeTest {//自然排序
    @Test
    public void test1(){
        Employee employee1 = new Employee("刘德华",55,new MyDate(1964,6,5));
        Employee employee2 = new Employee("张三丰",46,new MyDate(1978,12,8));
        Employee employee3 = new Employee("赵无极",86,new MyDate(1964,7,4));
        Employee employee4 = new Employee("徐三强",82,new MyDate(1964,12,29));
        Employee employee5 = new Employee("华子",13,new MyDate(1964,9,15));

        TreeSet<Employee> set = new TreeSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);


        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){//按照生日日期的先后排序


        Employee employee1 = new Employee("刘德华",55,new MyDate(1964,6,5));
        Employee employee2 = new Employee("张三丰",46,new MyDate(1978,12,8));
        Employee employee3 = new Employee("赵无极",86,new MyDate(1964,7,4));
        Employee employee4 = new Employee("徐三强",82,new MyDate(1964,12,29));
        Employee employee5 = new Employee("华子",13,new MyDate(1964,9,15));

        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                    MyDate b1 = o1.getBrithday();
                    MyDate b2 = o2.getBrithday();
                    return b1.compareTo(b2);
            }
        });
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
