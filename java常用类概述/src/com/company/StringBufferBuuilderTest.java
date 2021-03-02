package com.company;

import org.junit.Test;

/**
 * @author wangxiang
 * @create 2020-12-09-15:02
 */
public class StringBufferBuuilderTest {
    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1.toString());
        System.out.println(s1);
//        s1.delete(2,4);
//        s1.replace(2,4,"hello");
//        s1.insert(2, false);
        s1.reverse();
        System.out.println(s1);
        System.out.println(s1.length());
        String s2=s1.substring(1, 3);
        System.out.println(s2);

        char result=s1.charAt(3);
        System.out.println(result);

//        总结：
//        增：append(xxx)
//        删：delete(int start,int end)
//        改：setCharAt(int n,char ch)/ replace(int start,int end,String str)
//        查：charAt(int n)
//        插：insert(int n,xxx)
//        长度：length()
//        遍历：for+charAt() / toString()
    }




//    String,StringBuffer,StringBuilder三者的异同
//    String:不可变的字符序列：底层使用char[]存储
//    StringBuffer:不可变的字符序列：线程安全  效率偏低  底层使用char[]存储
//    StringBuilder:可变的字符序列：线程不安全 效率偏高  底层使用char[]存储
//    开发选择  多线程有共享数据用StringBuffer   单线程用StringBuilder

//    效率对比：StringBuilder>StringBuffer>String
//    建议：开发中建议使用：StringBuffer(int capacity)或者StringBuilder(int capacity)

//    StringBuffer扩容问题：如果要添加的数组底层数组（长度为16）装不下了，那就需
//    要扩容底层的数组默认情况下：扩容为原来容量的2倍+2，代码为左移一位+2，
//    同时将原有的数组中的元素赋值到新的数组中

    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }

}
