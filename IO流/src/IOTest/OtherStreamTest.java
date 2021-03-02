package IOTest;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wangxiang
 * @create 2020/12/31
 */
public class OtherStreamTest {

    public static void main(String[] args){
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while(true) {
                System.out.println("请输入字符串：");
                String data=br.readLine();
                if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序结束");
                    break;
                }
                String s = data.toUpperCase();
                System.out.println(s);
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

        }

    }
}
