package ObjectInputOutputStreamTest;

import jdk.nashorn.internal.codegen.SpillObjectCreator;
import org.junit.Test;

import java.io.*;

/**
 * @author wangxiang
 * @create 2020/12/31
 */
public class ObjectInputOutStreamTest {

//    序列化
    @Test
    public void test1(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("我爱中国"));
            oos.flush();

            oos.writeObject(new Person("王米",23));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null)
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    反序列化
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str=(String) obj;

            Person p=(Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null)
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
