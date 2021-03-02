package com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.property.StructureLoaderBuilder;

/**
 * @author wangxiang
 * @create 2020/12/23
 *
 * 使用enum定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum
 *
 * Enum类中的常用方法
 *
 * 4.使用enum关键字定义的枚举类实现接口的情况
 *  情况一：实现接口，在enum类中实现抽象方法
 *  情况二：
 */
public class Season1Test {

    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
//        toString()方法
        System.out.println(summer.toString());

//        values()
        System.out.println("********");
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

//        valueOf(String objName):根据提供的objName，返回与objName同名的对象
//        如果没有objName的枚举类对象，则抛出异常：IllegalArgumentException
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);

        winter.show();
    }
}

interface Info{
    void show();
}


//自定义枚举类
enum Season1 implements Info{

//    1.提供当前枚举类的对象，多个对象之间用,隔开，末尾对象用;结束
        SPRING("春天","春暖花开"){
    @Override
    public void show() {
        System.out.println("这是春天");
    }
},
        SUMMER("夏天","夏日炎炎"){
            @Override
            public void show() {
                System.out.println("这是夏天");
            }
        },
        AUTUMN("秋天","秋高气爽"){
            @Override
            public void show() {
                System.out.println("这是秋天");
            }
        },
        WINTER("冬天","寒风凛凛"){
            @Override
            public void show() {
                System.out.println("这是冬天");
            }
        };

//    2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

//    3.私有化类的构造器,并给对象属性赋值
    private Season1(String seasonName, String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

//    4.其他诉求，获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
//    4.其他诉求：提供toString()

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
    }

