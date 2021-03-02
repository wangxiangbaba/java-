package com.company;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangxiang
 * @create 2020/12/13
 *
 * JDK8之前的日期时间的API测试
 *
 * 3.SimpleDateFormat
 * 4.Calendar
 */
public class DateTimeTest1 {
//    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化何解析
//    1.两个操作
//    1.1   格式化：日期-->字符串
//    1.2   解析：格式化的逆过程：字符串-->日期

//    2.SimpleDateFormat的实例化
    @Test
    public void testSimpleDateFormat() throws ParseException {
//        实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

//        格式化：日期-->字符串
        Date date = new Date();
        System.out.println("date："+date);
        String format = sdf.format(date);
        System.out.println("format："+format);

//        解析：字符串-->日期
        String str="20-12-13 下午3:27";
        Date date1 = sdf.parse(str);
        System.out.println("date1："+date1);

//        按照指定的方式格式化和解析：调用带参的构造器
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh.mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        格式化
        String format1 = sdf1.format(date);
        System.out.println("format1："+format1);//2020-12-13 03:43:38
//        解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现)
//        否则就会抛异常
        Date date2 = sdf1.parse("2020-12-13 03:43:38");
        System.out.println("date2："+date2);

    }

//    练习1：字符串"2020.09-08"转换为java.sql.Date
    @Test
    public void test1() throws ParseException {
        String str="2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf1.parse(str);
        java.sql.Date date2=new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

//    练习2：一渔夫执行操作"三天打鱼两天晒网"
//    1990-01-01开始执行  提问某年某月某日是在打鱼还是晒网
//    举例：2020-09-08
//    总天数%5 ==1，2，3  ：打鱼
//    总天数%5 ==4，0     ：晒网
//    总天数的计算？
    @Test
    public void test2() throws ParseException {
        String str1="2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf1.parse(str1);
        String str2="1990-01-01";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf1.parse(str2);
        long time1=date1.getTime();
        long time2=date2.getTime();
        long time3=time1-time2;
        long time4=time3/1000;
        int day=(int)time4;
        int alldays=day/86400+1;
        System.out.println(alldays);
        if(alldays%5==1 || alldays%5==2 || alldays%5==3){
            System.out.println("今天是在打鱼");
        }
        if(alldays%5==4 || alldays%5==0){
            System.out.println("今天是在晒网");
        }
    }

//    Calendar日历类(抽象类)的使用
    @Test
    public void testCanlendar(){
//        1.实例化
//     方式一：创建其子类GregorianCalendar的对象
//     方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

//     常用方法
//        get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
//        set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
//        add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
//        getTime():日历类--->Date
        Date date = calendar.getTime();
        System.out.println(date);
//        setTime():Date-->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
