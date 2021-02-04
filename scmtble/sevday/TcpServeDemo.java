package scmtble.sevday;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.spec.RSAOtherPrimeInfo;

public class TcpServeDemo {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        try {
            //1.创建Socket
             serverSocket = new ServerSocket(8080);

            //2.等待客户端连接，连接成功返回一个新的Socket
            while (true){
                socket = serverSocket.accept();

                //3.读取客户端消息
                is = socket.getInputStream();

                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    String str = new String(buffer,0,len);
                    System.out.println(str);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
