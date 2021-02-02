package scmtble.oneday;
//for循环打印九九乘法表
public class demo05 {
    public static void main(String[] args) {
        for (int i = 1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i);
                if (i!=j){
                    System.out.print("\t");
                }
            }
            if (i!=9){
                System.out.println();
            }
        }
    }
}