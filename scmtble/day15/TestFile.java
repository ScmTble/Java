package scmtble.day15;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f1 = new File("E://pythonenv");
        System.out.println(f1);
        System.out.println(f1.exists());// 文件是否存在
        System.out.println(f1.length());// 文件长度
        System.out.println(f1.getAbsolutePath());// 获取全路径(绝对路径)

        // 获取该目录下的全部文件
        String[] list = f1.list();
        for (String s:list){
            System.out.println(s);
        }

        // 获取该目录下的全部File对象
        File[] files = f1.listFiles();
        for (File f:files){
            System.out.println(f.getName());
        }
    }
}
