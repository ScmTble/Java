package scmtble.sixday;

public class excption {

    public static void f(){
        int[] a = new int[10];
        a[10] = 10;
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
