package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangxiang
 * @create 2021/1/1
 */
public class ReflectionTest {

    @Test
    public void test1(){
        Person p1 = new Person("TOM",12);
        p1.age=10;
        System.out.println(p1.toString());
        p1.show();
    }

//    反射后
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
//      通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Person p1 = (Person) cons.newInstance("TOM", 12);
        System.out.println(p1.toString());

//      通过反射，调用对象指定的属性和方法
//        调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p1,10);
        System.out.println(p1.toString());

//        调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p1);

        System.out.println("*************");

//        调用私有的属性构造器方法
//        调用私有构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p2 = (Person) cons1.newInstance("jerry");
        System.out.println(p2.toString());

//        调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"ROSE");
        System.out.println(p1.toString());

//        调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);

    }

//    获取Class的实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
//        方式一：调用运行时类的属性：.class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

//        方式二：通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println(clazz2);

//        方式三：调用Class的静态方法：forName(String classPath) 使用较多
        Class clazz3 = Class.forName("反射.Person");
        System.out.println(clazz3);

//        方式四：使用类的加载器：ClassLoader  了解
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("反射.Person");
        System.out.println(clazz4);
    }
}
