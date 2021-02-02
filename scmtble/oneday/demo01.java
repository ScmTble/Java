package scmtble.oneday;

import java.util.Scanner;
//scanner用法
public class demo01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("使用nextLine方式接受：");
        String str = scanner.nextLine();
        System.out.println("输出的内容为："+str);
    }
}
