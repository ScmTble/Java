package scmtble.sevday;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        byte[] buffer = new byte[1024];
        try {
            int len = System.in.read(buffer);
            String s = new String(buffer,0,len);
            System.out.println(s);
            System.out.println("字节数：" + len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
