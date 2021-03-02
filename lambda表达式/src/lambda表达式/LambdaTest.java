package lambda表达式;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author wangxiang
 * @create 2021/1/3
 *
 * Lambda表达式的使用举例
 */
public class LambdaTest {

    @Test
    public void test1(){

        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();

        System.out.println("************");

        Runnable r2=() -> System.out.println("我敬爱毛主席");
        r2.run();

        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        int compare1 = com1.compare(12, 21);
        System.out.println(compare1);

        System.out.println("*****");

//        Lambda表达式写法
        Comparator<Integer> com2=(o1,o2) -> Integer.compare(o1,o2);
        int compare2 = com2.compare(32, 21);
        System.out.println(compare2);

//        方法引用::
        Comparator<Integer> com3=Integer::compareTo;
        int compare3 = com2.compare(32, 21);
        System.out.println(compare3);

    }

}
