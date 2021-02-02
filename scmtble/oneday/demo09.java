package scmtble.oneday;

//递归(方法调用自己)

public class demo09 {
    public static void main(String[] args) {


        System.out.println(f(3));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*f(n-1);
        }
    }
}
