package com.company;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author wangxiang
 * @create 2020/12/13
 */
public class LocalTest {
    //    LocateDate,LocalTime,LocalDateTime的使用
//    LocalDateTime比其他两个类使用更多
    @Test
    public void test1() {
//        now：获取当前的日期，时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

//        of()：设置指定的年月日时分秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1);

//        getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

//        with()
//        体现不可变性localDate
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate.withDayOfMonth(22));
        System.out.println(localDate);
        System.out.println(localDate1);


    }
}
