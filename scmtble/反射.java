package scmtble;

import java.util.Date;

public class 反射 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的Class对象
        Class c1 = Class.forName("java.util.Date");
        System.out.println(c1);

        // 一个类在内存中只有一个Class对
        Class c2 = Class.forName("java.util.Date");
        Class c3 = Class.forName("java.util.Date");
        Class c4 = Class.forName("java.util.Date");

        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

        Date date = new Date();
        System.out.println(date.getClass());

        System.out.println(Date.class);

        System.out.println(Integer.TYPE);
    }
}
