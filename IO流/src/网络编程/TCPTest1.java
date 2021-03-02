package 网络编程;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author wangxiang
 * @create 2020/12/31
 */
public class TCPTest1 {

    //    客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();
            os.write("你好，我是XXX".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (socket != null)
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }


    //    服务端
    @Test
    public void server() {

        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            ss = new ServerSocket(8899);
            socket = ss.accept();

            is = socket.getInputStream();
//        方式一不建议
//        byte[] buffer=new byte[200];
//        int len;
//        while((len= is.read(buffer)) != -1){
//            String str=new String(buffer,0,len);
//            System.out.print(str);
//        }

            baos = new ByteArrayOutputStream();
            byte[] buffer=new byte[5];
            int len;
            while((len= is.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos != null)
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(socket != null)
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(ss != null)
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }
}
