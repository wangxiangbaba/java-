package com.Generic;

import org.junit.Test;

import java.util.*;

/**
 * @author wangxiang
 * @create 2020/12/27
 *
 *
 */
public class GenericTest {

    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(78);
        arrayList.add(79);
        arrayList.add(60);
        arrayList.add(25);
        arrayList.add(5);
//        问题一：类型不安全
//        arrayList.add("TOM");

        for(Object obj:arrayList){
//            问题二：强转时：可能出现ClassCastException
            int studentScore= (int) obj;
            System.out.println(studentScore);

        }
    }

    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(132);
        list.add(1);
        list.add(12);
        list.add(1322);
        list.add(13252);

        for(Integer score:list){
//            避免了强转操作
            int studentScore=score;
            System.out.println(studentScore);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int studentscore=iterator.next();
            System.out.println(studentscore);
        }
    }

    @Test
    public void test3(){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("TOm",87);
        map.put("jack",13);
        map.put("LORSE",53);
        map.put("ROSE",64);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key=next.getKey();
             int value=next.getValue();
            System.out.println(key+"=="+value);
        }

    }
}
