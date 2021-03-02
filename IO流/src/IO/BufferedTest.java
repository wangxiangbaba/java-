package IO;

import org.junit.Test;

import java.io.*;

/**
 * @author wangxiang
 * @create 2020/12/29
 *
 * 缓冲流的使用
 */
public class BufferedTest {

    @Test
    public void test1(){

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile=new File("简历照片.jpeg");
            File destFile=new File("简历照片3.jpeg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer=new byte[10];
            int len;

            while ((len=bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null)
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis != null)
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        资源关闭，先关外层流，再关内层流
//        bos.close();
//        bis.close();
//        关闭外层流的同时，内层流也会自动的进行关闭
//        fos.close();
//        fis.close();
    }

    public void copyFileWithBuffered(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile=new File(srcPath);
            File destFile=new File(destPath);

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer=new byte[10];
            int len;

            while ((len=bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("helloX.txt")));

            char[] cbuf=new char[1024];
            int len;
            while ((len=br.read(cbuf)) != -1){
                bw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null)
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bw != null)
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
