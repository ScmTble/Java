package scmtble.sevday;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) i;
        }
        try {
            FileOutputStream out = new FileOutputStream("a.txt");
            out.write(buf);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
