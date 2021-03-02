package 反射2;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import 反射1.Person;

import java.lang.reflect.Field;

/**
 * @author wangxiang
 * @create 2021/1/2
 */
public class FiledTest {

    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

//        获取属性结构
//        getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for(Object obj:fields){
            System.out.println(obj);
        }

        System.out.println("********");

//        getDeclaredFields():获取当前运行时类中声明的所有属性,不包含父类声明的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Object obj:declaredFields){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f:declaredFields){
//            权限修饰符
            int m = f.getModifiers();
            System.out.print(m+"\t");
//            数据类型
            Class<?> type = f.getType();
            System.out.print(type.getName()+"\t");
//            变量名
            String fname = f.getName();
            System.out.print(fname);
            System.out.println();
        }
    }
}
