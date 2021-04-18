package scmtble.day13;

public class stringdemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1==str2);

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
