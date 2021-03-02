package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author wangxiang
 * @create 2020/12/28
 */
public class HomeWork {
    @Test
    public void test1() throws IOException {
        File file1=new File("E:\\ideal专业版\\ideal project\\java学习代码\\IO流\\hello.txt");
        File file2=new File(file1.getParent(),"haha.txt");
        boolean newFile = file2.createNewFile();
        if(newFile){
            System.out.println("创建成功");
        }
    }
}
