package scmtble.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args){
        File f = new File("./test.txt");
        File w = new File("./result.txt");
        try (
                FileInputStream fileInputStream = new FileInputStream(f);
                FileOutputStream fileOutputStream = new FileOutputStream(w)
        ) {
            byte[] bytes = new byte[(int) f.length()];
            fileInputStream.read(bytes);
            for (byte b:bytes){
                System.out.println(b);
            }
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
