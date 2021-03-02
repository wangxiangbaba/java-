package 反射2;

import org.junit.Test;
import 反射1.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangxiang
 * @create 2021/1/2
 *
 * 调用运行时类指定的接哦古：属性，方法，构造器
 */
public class ReflectTest {

    @Test
//    获取指定属性
    public void test1() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Person p1 = (Person)clazz.newInstance();

        Field name = clazz.getDeclaredField("name");
//        保证当前属性是可访问的
        name.setAccessible(true);
        name.set(p1,"王祥");
        System.out.println(name.get(p1));


//        如何操作运行时类中的指定的方法
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        show.invoke(p1,"CHN");
        Object chn = show.invoke(p1, "CHN");
        System.out.println(chn);

//        如何调用静态方法
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        showDesc.invoke(Person.class);

//        获取调用运行时类指定的构造器
        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Person person = declaredConstructor.newInstance("TOM");
        System.out.println(person);
    }
}
