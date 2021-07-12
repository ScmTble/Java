package scmtble.day15;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        try(
            FileReader fr =  new FileReader(file);
            BufferedReader br =  new BufferedReader(fr)
        ) {
            while (true){
                String s = br.readLine();
                if(s==null){
                    break;
                }
                System.out.println(s);
            }

        }
    }
}
