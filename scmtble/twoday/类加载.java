package scmtble.twoday;

public class 类加载 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
    }
}

class A{


    static int m = 100;

    public A() {
        System.out.println("无参构造");
    }

    static {
        System.out.println("static执行");
        m = 300;
    }
}
