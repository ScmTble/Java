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

        try {
            //1.创建Socket
            ServerSocket serverSocket = new ServerSocket(8080);

            //2.等待客户端连接，连接成功返回一个新的Socket
            Socket socket = serverSocket.accept();

            //3.读取客户端消息
            InputStream is = socket.getInputStream();

            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(bytes)) != -1) {
                //注意指定编码格式，发送方和接收方一定要统一，建议使用UTF-8
                sb.append(new String(bytes, 0, len,"UTF-8"));
            }

            System.out.println("get message from client: " + sb);

            socket.close();
            is.close();
            serverSocket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
