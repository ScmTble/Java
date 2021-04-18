package scmtble.day14;

import java.io.*;
import java.util.Scanner;

public class tryWithRes {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("test.txt")))
        {
            while (scanner.hasNext())
            {
                System.out.println(scanner.nextLine());
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
