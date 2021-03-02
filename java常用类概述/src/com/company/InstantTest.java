package com.company;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;


//Instant了类似于java.util.Date
/**
 * @author wangxiang
 * @create 2020/12/22
 */
public class InstantTest {
    @Test
    public void test1(){
//        now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

//        添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

//        获取对应的毫秒数  距离1970年
        long l = instant.toEpochMilli();
        System.out.println(l);

//        通过给定的毫秒数，过去Instant实例
        Instant instant1 = Instant.ofEpochMilli(1608627049345L);
        System.out.println(instant1);

//        DateTimeFormatter:格式化或者解析日期，时间
//        类似于SimpleDateFormate

    }
}
