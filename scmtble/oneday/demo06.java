package scmtble.oneday;

//for循环进阶用法

public class demo06
{
    public static void main(String[] args)
    {
        int sum = add(1,2);
        System.out.println(sum);

    }



    public static int add(int a,int b)
    {
        if (a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
