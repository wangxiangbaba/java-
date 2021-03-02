package com.company;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangxiang
 * @create 2020/12/23
 */
public class Comparator {
    @Test
    public void test1(){
        String[] arr=new String[]{"AA","CC","MM","GG","DD","ZZ"};
        Arrays.sort(arr, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1=(String) o1;
                    String s2=(String) o2;
                    return -s1.compareTo(s2);//加负号  从大到小
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
