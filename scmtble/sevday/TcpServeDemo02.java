package scmtble.sevday;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServeDemo02 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();

        FileOutputStream f = new FileOutputStream("D://a.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            f.write(buffer,0,len);
        }

        f.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
