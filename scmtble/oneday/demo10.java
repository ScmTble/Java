package scmtble.oneday;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i=0;i<numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int num:numbers)
        {
            System.out.println(num);
        }
    }
}