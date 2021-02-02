package scmtble.fiveday;

public class BaseClass {
    private int a;
    private int b;

    public BaseClass() {
        this.a = 0;
        this.b = 0;
    }

    public BaseClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return this.a + this.b;
    }

    public static void main(String[] args) {
        BaseClass obj1 = new BaseClass(1,2);
        int sum = obj1.add();
        System.out.println(sum);
    }

}
