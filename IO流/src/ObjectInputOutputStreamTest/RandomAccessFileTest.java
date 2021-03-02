package ObjectInputOutputStreamTest;

import org.junit.Test;

import java.io.File;
import java.io.*;


/**
 * @author wangxiang
 * @create 2020/12/31
 */
public class RandomAccessFileTest {

    @Test
    public void test1(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("简历照片.jpeg"),"r");
            raf2 = new RandomAccessFile(new File("简历照片1.jpeg"),"rw");

            byte[] buffer=new byte[1024];
            int len;
            while((len=raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null)
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(raf2 != null)
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void test2(){
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("hello.txt"),"rw");
            raf1.seek(3);
            raf1.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null)
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
