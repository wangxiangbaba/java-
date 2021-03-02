package 方法引用;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用的使用
 * <p>
 * Created by shkstart.
 */
public class MethodRefTest {

    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1() {

        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");

        System.out.println("*******");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("东京");

    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2() {

        Employee employee = new Employee(1001, "TOM", 23, 5600);
        Supplier<Integer> sup1 = () -> employee.getAge();
        System.out.println(sup1.get());

        System.out.println("************");

        Supplier<String> sup2 = employee::getName;
        System.out.println(sup2.get());


    }

    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3() {
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(12, 21));

        System.out.println("*************");

        Comparator<Integer> com2 = Integer::compareTo;
        System.out.println(com2.compare(21, 99));


    }

    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4() {

        Function<Double, Long> function1 = d -> Math.round(d);
        System.out.println(function1.apply(12.3));

        System.out.println("*************");

        Function<Double, Long> function2 = Math::round;
        System.out.println(function1.apply(12.6));
    }

    // 情况三：类 :: 实例方法
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5() {
        Comparator<String> com1 = (t1, t2) -> t1.compareTo(t2);
        System.out.println(com1.compare("abc", "abd"));

        System.out.println("*************");

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("adb", "abt"));

    }

    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6() {

        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("avc", "avc"));

        System.out.println("*************");

        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre1.test("abc", "avc"));
    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7() {
        Employee tom = new Employee(12, "TOM", 12, 5000);

        Function<Employee,String> function1=e ->e.getName();
        System.out.println(function1.apply(tom));

        System.out.println("*************");

        Function<Employee,String> function2=Employee::getName;
        System.out.println(function2.apply(tom));

    }

}
