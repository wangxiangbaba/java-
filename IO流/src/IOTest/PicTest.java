package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * @author wangxiang
 * @create 2020/12/29
 */
public class PicTest {

//    图片的加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("简历照片.jpeg"));
            fos = new FileOutputStream(new File("简历照片secret.jpeg"));

            byte[] buffer=new byte[20];
            int len;
            while ((len=fis.read(buffer)) != -1){
                for (int i = 0; i < len; i++) {
                    buffer[i]= (byte) (buffer[i]^5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

//    图片的解密
    @Test
    public void test2(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("简历照片secret.jpeg"));
            fos = new FileOutputStream(new File("简历照片解密.jpeg"));

            byte[] buffer=new byte[20];
            int len;
            while ((len=fis.read(buffer)) != -1){
                for (int i = 0; i < len; i++) {
                    buffer[i]= (byte) (buffer[i]^5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test3()  {

        InputStreamReader isr1 = null;//使用系统默认的
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
            isr1 = new InputStreamReader(fis);
//        字符集转换
//        InputStreamReader isr2 = new InputStreamReader(fis,"UTF-8");
//        使用设置的字符集

            char[] cbuf=new char[20];
            int len;
            while ((len=isr1.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr1 != null)
                try {
                    isr1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void test4() throws IOException {

        File file1 = new File("hello.txt");
        File file2 = new File("hello_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        char[] cbuf=new char[20];
        int len;
        while ((len=isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        osw.close();
        isr.close();
    }
}
