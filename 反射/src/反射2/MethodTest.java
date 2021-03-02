package 反射2;

import org.junit.Test;
import 反射1.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author wangxiang
 * @create 2021/1/2
 */
public class MethodTest {
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

//        获取方法
//        getMethods():获取当前运行时类及其父类中声明为public访问权限的方法
        Method[] methods = clazz.getMethods();
        for(Object obj:methods){
            System.out.println(obj);
        }

        System.out.println();

//        getDeclaredMethods():获取当前运行时类中声明的所有方法,不包含父类声明的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Object obj:declaredMethods){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m:declaredMethods){
            //获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for(Annotation a : annotations){
                System.out.println(a);
            }

//            权限修饰符
            System.out.print(Modifier.toString(m.getModifiers())+"\t");

//            返回值类型
            System.out.print(m.getReturnType().getName()+"\t");

//            方法名
            System.out.print(m.getName());

            System.out.print("(");
//            形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null || parameterTypes.length == 0)){
                for(Class p:parameterTypes){
                    System.out.print(p.getName()+"args_"+p);
                }
            }

            System.out.print(")");

            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if(!(exceptionTypes == null || exceptionTypes.length == 0)){
                for(Class p:exceptionTypes){
                    System.out.print(p.getName());
                }
            }

            System.out.println();
        }


    }
}
