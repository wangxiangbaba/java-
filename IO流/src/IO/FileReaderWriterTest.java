package IO;

import org.junit.Test;

import java.io.*;

/**
 * @author wangxiang
 * @create 2020/12/29
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file1 = new File("hello.txt");//相较于当前工程
        System.out.println(file1.getAbsolutePath());
    }

    @Test
    public void test1() {

        FileReader fr = null;
        try {
            File file1 = new File("hello.txt");//相较于当前Module
            System.out.println(file1.getAbsolutePath());

            fr = new FileReader(file1);

//        数据的读入：read()：返回读入的一个字符，如果达到文件末尾，返回-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }


            int data1;
            while ((data1 = fr.read()) != -1) {
                System.out.print((char) data1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        流的关闭操作,否则容易导致内存泄漏
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        FileReader fr = null;
        try {
            File file1 = new File("hello.txt");//相较于当前Module
            fr = new FileReader(file1);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
//                System.out.println();
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3()  {
        FileWriter fw = null;
        try {
            File file1 = new File("hello1.txt");

            fw = new FileWriter(file1, false);
            //false对原有文件进行内容覆盖
//        true对原有文件进行追加内容添加

            fw.write("I hava a dream!\n");
            fw.write("YOu  IADCDA DA ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test4()  {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file1 = new File("hello.txt");
            File file2 = new File("hello2.txt");

            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            char[] cbuf = new char[5];
            int len;//记录读入数据的长度
            while ((len = fr.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    fw.write(cbuf, 0, len);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(fw!=null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}

