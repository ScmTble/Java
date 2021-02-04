package scmtble.sevday;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class TcpClientDemo {
    public static void main(String[] args) {

        Socket socket = null;
        OutputStream os = null;
        try {
            //1.准备ip和port
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 8080;

            //2.创建一个socket连接
            socket = new Socket(ip,port);

            //3.发送消息
            os = socket.getOutputStream();
            os.write("abd".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}
