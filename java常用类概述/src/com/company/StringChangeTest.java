package com.company;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author wangxiang
 * @create 2020-12-09-13:43\
 * <p>
 * 设计到String类与其他结构之间的转换
 */
public class StringChangeTest {
    //    String与byte[]之间的转换
//    String-->byte[]：调用String的getBytes()
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] byte1 = str1.getBytes();//使用默认的字符编码集进行转换
        System.out.println(Arrays.toString(byte1));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

//        byte[]-->String：调用String的构造器
        String str2=new String(byte1);
        System.out.println(str2);

        String str3=new String(gbks);
        System.out.println(gbks);//出现乱码  编码集与解码集不一样

        String str4 = new String(gbks,"gbk");
        System.out.println(str4);

    }


    //    String与char[]之间的转换
//    String-->char[]:调用String的toCharArray()
    @Test
    public void test2() {
        String str1 = "abc123";
        char[] char1 = str1.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            System.out.println(char1[i]);
        }

//        char[]-->String:调用String的构造器
        char[] arr1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(arr1);
        String str2 = new String(arr1);
        System.out.println(str2);
    }

    //    String与其他基本数据类型丶包装类之间的转换
//    String--> 基本数据类型丶包装类:调用包装类的静态方法：parseXxx(str)
    @Test
    public void test1() {
        String str1 = "123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        //    基本数据类型丶包装类-->String:调用String重载的valueOf(xxx)
        String str2 = String.valueOf(num1);
        System.out.println(str2);

        String str3 = num1 + "";

        System.out.println(str1 == str3);//false

    }
}
