package com.company;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

/**
 * @author wangxiang
 * @create 2020-12-09-16:53
 * <p>
 * JDK之前的日期时间API测试
 */
public class DateTimeTest {

//    Date类
//    java.util.Date类（父类）
//    1.两个构造器的使用
//      构造器一：Date() 创建了一个对应当前时间的Date对象
//        Date date1 = new Da41te();
//        System.out.println(date1.toString());
//        System.out.println(date1.getTime());
//
//        构造器二：创建指定毫秒数的Date对象
//        Date date2 = new Date(1607504706472L);
//        System.out.println(date2.toString());

//    2.两个方法的使用
//        1.toString():显示当前的年月日时分秒
//        2.getTime():返回当前Date与1970.1.1 0:0:0之间的以毫秒为单位的时间差
//    java.sql.Date（子类）

//    3.java.sql.Date对应着数据库中的日期类型的变量
//    如何实例化？
//       创建java.sql.Date对象
//        java.sql.Date date3 = new java.sql.Date(1607505003681L);
//        System.out.println(date3.toString());//2020-12-09
//
//    sql.Date-->util.Date 转换  直接赋值     属于子父类
//
//    util.Date-->sql.Date
//        将java.util.Date对象-->java.sql.Date对象
////        1.面向对象方式
//        Date date4=new java.sql.Date(1607505003681L);
//        java.sql.Date date5= (java.sql.Date) date4;
////        2.
//        Date date6=new Date();
//        java.sql.Date date7=new java.sql.Date(date6.getTime());


    @Test
    public void test2(){
//      构造器一：Date() 创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime());

//      构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1607504706472L);
        System.out.println(date2.toString());

//       创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(1607505003681L);
        System.out.println(date3.toString());//2020-12-09

//        将java.util.Date对象-->java.sql.Date对象
//        1.面向对象方式
        Date date4=new java.sql.Date(1607505003681L);
        java.sql.Date date5= (java.sql.Date) date4;
//        2.
        Date date6=new Date();
        java.sql.Date date7=new java.sql.Date(date6.getTime());
    }


    //  1.System类中的currentTimeMillis()
    @Test
    public void test() {
        long time = System.currentTimeMillis();
//        返回当前时间与1970.1.1 0:0:0之间的以毫秒为单位的时间差
//        称为时间戳
        System.out.println(time);
    }
}
