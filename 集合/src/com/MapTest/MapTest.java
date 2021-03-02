package com.MapTest;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wangxiang
 * @create 2020/12/26
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("AA",87);
        map.put(45,123 );
        map.put("BB",456);
        map.put("DD",785);

        System.out.println(map);

//        遍历所有的key急：keySet()
        Set set = map.keySet();
        for(Object obj:set){
            System.out.print(obj+",");
        }

        System.out.println();

//        遍历所有的value集:value()
        Collection values = map.values();
        for(Object obj:values){
            System.out.print(obj+",");
        }

        System.out.println();

//        遍历所有的key-value:entrySet()
        Set set1 = map.entrySet();
        for(Object obj:set1){
            System.out.print(obj+",");
        }

        System.out.println(map.get(45));

        System.out.println(map.size());

        boolean bb = map.containsKey("BB");
        System.out.println(bb);

        boolean b = map.containsValue(123);
        System.out.println(b);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",87);

        map.putAll(map1);
        System.out.println(map);

//        remove(Object key)
        Object value = map.remove("CC");
        Object value1 = map.remove("CCC");
        System.out.println(value);
        System.out.println(value1);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.isEmpty());

    }
}
