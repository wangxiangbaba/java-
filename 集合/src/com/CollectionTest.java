package com;

import org.junit.Test;

import java.util.*;

/**
 * @author wangxiang
 * @create 2020/12/24
 *
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();

//        add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        coll.add(new String("TOM"));
        coll.add(new Person("王祥",21));

//        size()：获取添加的元素的个数
        System.out.println(coll.size());


//        addAll(Collection coll1):将coll1集合中的元素添加到当前集合中
        Collection coll1=new ArrayList();
        Collection coll2=new ArrayList();
        coll1.add("AC");
        coll1.add("SDW");
        coll1.add(123);
        coll1.add("BC");
        coll1.add("SDWA");
        coll2.add("AA");
        coll2.add("BB");
        coll.addAll(coll1);

        System.out.println(coll.size());

        System.out.println(coll);

//        clear()：清空集合元素
//        coll.clear();

//        isEmpty()：判断当前集合是否为空，是否有元素
        System.out.println(coll.isEmpty());

//        contains(Object obj):判断当前集合中  是否包含obj
        boolean contains = coll.contains("SDW");
        System.out.println(contains);

//        containsAll(Collection coll1):判断coll1中的所有元素是否都存在与当前集合中
        boolean b = coll.containsAll(coll1);
        System.out.println(b);

        coll.remove(123);
        System.out.println(coll);

//        removeAll(Collection call1):从当前集合中移除coll1中的所有元素
        coll.removeAll(coll1);
        System.out.println(coll);

//        retainAll(Collection coll2):求元素交集
        coll.retainAll(coll2);
        System.out.println(coll);

//        equals(Object obj):比较两个集合是否是相等的
        System.out.println(coll.equals(coll1));

//        hashCode()：返回当前对象的哈希值
        System.out.println(coll.hashCode());

//        集合->数组：toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

//        数组->集合：调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC", "DD", "EE"});
        System.out.println(list);

        List<Integer> arr1 = Arrays.asList(123, 456);
        System.out.println(arr1);

//        iterator()迭代器接口:返回Iterator接口的实例，用于遍历集合元素
        Collection coll3=new ArrayList();
        coll3.add("AA");
        coll3.add("BB");
        coll3.add(123);
        coll3.add(new Date());
        coll3.add(new String("TOM"));
        coll3.add(new Person("王祥",21));

        Iterator iterator = coll3.iterator();

//        方式一:
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        方式二：不推荐
//        for (int i = 0; i < coll3.size(); i++) {
//            System.out.print(iterator.next()+",");
//        }

//        方式三：推荐
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }

    @Test
    public void test2(){
        Collection coll=new ArrayList();

//        add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        coll.add(new String("TOM"));
        coll.add(new Person("王祥",21));

        Iterator iterator = coll.iterator();
//        删除集合中的TOM元素
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("TOM".equals(obj)){
                iterator.remove();
            }
        }

        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }

    @Test
    public void test3(){
        Collection coll=new ArrayList();

//        add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        coll.add(new String("TOM"));
        coll.add(new Person("王祥",21));

//        使用foreach遍历
//        内部仍然调用迭代器
        for(Object obj:coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test4(){
        int[] arr=new int[]{1,2,3,4,5,6};
        for(int i:arr){
            System.out.println(i);
        }
    }

}
