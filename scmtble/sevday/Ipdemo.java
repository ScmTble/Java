package scmtble.sevday;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipdemo {
    public static void main(String[] args) {
        try {
            //查询IP
            InetAddress ip = InetAddress.getByName("www.baidu.com");
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip);
            System.out.println(ip1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
