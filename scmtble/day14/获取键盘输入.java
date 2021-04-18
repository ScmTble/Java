package scmtble.day14;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 获取键盘输入 {
    @Test
    public void input1()
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        input.close();
    }


    @Test
    public void input2()
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = input.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
