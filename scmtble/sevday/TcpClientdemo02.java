package scmtble.sevday;


import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientdemo02 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8080);
        OutputStream os = socket.getOutputStream();

        FileInputStream f = new FileInputStream("D://4am.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = f.read(buf)) != -1){
            os.write(buf,0,len);
        }

        f.close();
        os.close();
        socket.close();
    }
}
