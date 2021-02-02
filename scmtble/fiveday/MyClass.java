package scmtble.fiveday;

public class MyClass extends BaseClass{
    @Override
    public int add() {
        return 1;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        int sum =  obj.add();
        System.out.println(sum);
    }
}
