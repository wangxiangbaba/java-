package 方法引用;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *
 * 二、数组引用
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee> sup1=() -> new Employee();
        System.out.println(sup1.get());

        Supplier<Employee> sup2=Employee::new;
        System.out.println(sup1.get());

    }

	//Function中的R apply(T t)
    @Test
    public void test2(){
        Function<Integer,Employee> function1=id ->new Employee(id);
        Employee apply1 = function1.apply(1001);
        System.out.println(apply1);

        System.out.println("************");

        Function<Integer,Employee> function2=Employee::new;
        Employee apply2 = function1.apply(1002);
        System.out.println(apply2);

    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){

        BiFunction<Integer,String,Employee> function1=(id,name) -> new Employee(id,name);
        System.out.println(function1.apply(1001,"ROSE"));

        System.out.println("************");

        BiFunction<Integer,String,Employee> function2=Employee::new;
        System.out.println(function1.apply(1001,"ROSE"));


	}

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){

        Function<Integer,String[]> function1=length -> new String[length];
        String[] app1 = function1.apply(5);
        System.out.println(Arrays.toString(app1));

        System.out.println("************");

        Function<Integer,String[]> function2=String[]::new;
        String[] app2 = function1.apply(10);
        System.out.println(Arrays.toString(app2));

    }
}
