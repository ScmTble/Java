package scmtble.day15;

import java.io.*;

//
public class TestFileReader {
    public static void main(String[] args) {
        File f = new File("./test.txt");
        File f1 = new File("./result.txt");
        try(
            FileReader fileReader =  new FileReader(f);
            FileWriter fileWriter = new FileWriter(f1);
        ) {
            char[] chars = new char[(int) f.length()];
            fileReader.read(chars);
            for (char c:chars){
                System.out.print(c);
            }

            fileWriter.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
