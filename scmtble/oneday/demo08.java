package scmtble.oneday;
//可变参数
public class demo08 {
    public static void main(String[] args) {
        demo08 dem = new demo08();
        dem.add(1,2,3,9,8);
    }

    public void add(int... num)
    {
        for (int i:num)
        {
            System.out.println(i);
        }

    }
}
