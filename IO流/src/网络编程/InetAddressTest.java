package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wangxiang
 * @create 2020/12/31
 *
 * 在java中使用InetAddress类代表IP
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
