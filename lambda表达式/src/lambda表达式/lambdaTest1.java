package lambda表达式;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author wangxiang
 * @create 2021/1/3
 * <p>
 * lambda表达式的使用
 */
public class lambdaTest1 {
    @Test
    public void test1() {
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("谎言1");

        System.out.println("********");

        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("誓言2");

        Consumer<String> con3 = (s) -> {
            System.out.println(s);
        };
        con3.accept("誓言3");

        Consumer<String> con4 = s -> {
            System.out.println(s);
        };
        con4.accept("誓言4");

        Consumer<String> con5 = s -> System.out.println(s);

        con5.accept("誓言4");


        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com1.compare(12, 21));

        Comparator<Integer> com2=(o1,o2) ->{
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1,o2);
        };
        System.out.println(com2.compare(21, 89));

        Comparator<Integer> com3=(o1,o2) ->{
            return Integer.compare(o1,o2);
        };
        System.out.println(com3.compare(21, 89));

        Comparator<Integer> com4=(o1,o2) ->  o1.compareTo(o2);

        System.out.println(com3.compare(21, 89));

      

    }
}
