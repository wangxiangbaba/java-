package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class FileTest {

    @Test
//    创建File类的实例
    public void test1(){

        File file1=new File("hello.txt");
        File file2=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

        File file3=new File("E:\\ideal专业版\\ideal project\\java学习代码","File创建文件夹");
        System.out.println(file3);

        File file4=new File(file3,"H1.txt");
        System.out.println(file4);


   }

   @Test
    public void test2(){
       File file1=new File("hello.txt");
       File file2=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\he.txt");

       System.out.println(file1.getAbsolutePath());
       System.out.println(file1.getPath());
       System.out.println(file1.getName());
       System.out.println(file1.getParent());
       System.out.println(file1.length());
       System.out.println(new Date(file1.lastModified()));

       System.out.println();

       System.out.println(file2.getAbsolutePath());
       System.out.println(file2.getPath());
       System.out.println(file2.getName());
       System.out.println(file2.getParent());
       System.out.println(file2.length());
       System.out.println(file2.lastModified());
       System.out.println();

       File file3=new File("E:\\ideal专业版\\ideal project\\java学习代码");

       String[] list=file3.list();
       for(String s:list){
           System.out.println(s);
       }

       System.out.println();

       File[] files = file3.listFiles();
       for(File f:files){
           System.out.println(f);
       }
       System.out.println();
   }

   @Test
    public void test3(){
//        要想保证返回true，需要file1在硬盘中是存在的，且file2不能在硬盘中存在
       File file1=new File("hello.txt");
       File file2=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\hi.txt");

       boolean b = file1.renameTo(file2);
       System.out.println(b);

   }

   @Test
    public void test4(){
       File file1=new File("hello.txt");
       System.out.println(file1.isDirectory());
       System.out.println(file1.isFile());
       System.out.println(file1.exists());
       System.out.println(file1.canRead());
       System.out.println(file1.canWrite());
       System.out.println(file1.isHidden());


   }

   @Test
    public void test5() throws IOException {
       File file1=new File("hash.txt");
       if(!file1.exists()){
           file1.createNewFile();
           System.out.println("创建成功");
       }else{
           file1.delete();
           System.out.println("删除成功");
       }
   }

    @Test
    public void test6(){
        File file1=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\IOcreate");
        boolean mkdir1 = file1.mkdir();
        if(mkdir1){
            System.out.println("创建成功");
        }

        File file2=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\IOcreate2");
        boolean mkdir2 = file2.mkdirs();
        if(mkdir2){
            System.out.println("创建成功2");
        }
    }
}

