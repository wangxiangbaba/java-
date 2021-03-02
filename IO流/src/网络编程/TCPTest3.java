package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wangxiang
 * @create 2021/1/1
 */
public class TCPTest3 {

    @Test
    public void client(){

        Socket socket = null;
        OutputStream os= null;
        FileInputStream fis = null;
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

            os = socket.getOutputStream();

            fis = new FileInputStream(new File("简历照片.jpeg"));

            byte[] buffer=new byte[1024];
            int len;
            while ((len= fis.read(buffer)) != -1){
                os.write(buffer,0,len);
            }

//           关闭数据的输出
            socket.shutdownOutput();

            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buffer1=new byte[20];
            int len1;
            while ((len1= is.read(buffer1)) != -1){
                baos.write(buffer1,0,len1);
            }
            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(socket != null)
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(baos != null)
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void server(){

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os=null;

        try {
            serverSocket = new ServerSocket(9090);

            socket = serverSocket.accept();

            is = socket.getInputStream();

            fos = new FileOutputStream(new File("beauty5.jpeg"));


            byte[] buffer=new byte[1024];
            int len;
            while ((len= is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

            System.out.println("图片传输完成");
            os = socket.getOutputStream();
            os.write("你好，照片我已经收到".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null)
                try {
                    fos.close();
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
            if(serverSocket != null)
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(os != null)
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
