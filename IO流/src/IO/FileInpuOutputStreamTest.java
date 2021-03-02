package IO;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wangxiang
 * @create 2020/12/29
 */
public class FileInpuOutputStreamTest {
    @Test
    public void test1() {
        FileInputStream fis = null;
        try {
            File file1 = new File("hello.txt");

            fis = new FileInputStream(file1);

            byte[] buffer=new byte[5];
            int len;//记录每次读取的字节的个数

            while((len=fis.read(buffer)) != -1){
                String str=new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
