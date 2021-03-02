package 反射;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangxiang
 * @create 2021/1/2
 *
 * 了解类的加载器
 */
public class ClassLoaderTest {

    @Test
    public void test1(){

//        对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

//        调用系统类加载器的getParent():获取扩展类加载器
        ClassLoader classloader1 = classLoader.getParent();
        System.out.println(classloader1);

//        调用扩展类加载器的getParent():无法获取引导类加载器
//        引导类加载器主要负责加载java的核心类库，无法加载自定义类的
        ClassLoader classloader2 = classloader1.getParent();
        System.out.println(classloader2);
    }

    @Test
//    读取配置文件
    public void test2() throws IOException {


        Properties pros = new Properties();
//        读取配置文件的方式一
//        读取的文件默认在当前的moudle下  没有module就在当前项目下
//        FileInputStream fis = new FileInputStream("jdbc2.properties");
//        pros.load(fis);

//        方式二：使用ClassLoader
//        配置文件默认识别为当前module的src下  或者项目的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc3.properties");
        pros.load(is);

        String user= pros.getProperty("user");
        String password= pros.getProperty("password");
        System.out.println("user="+user+",password"+password);
    }
}
