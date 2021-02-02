package scmtble.thrday;

public class clock {
    private display hour = new display(24);
    private display mint = new display(60);


    public void start(){
        while (true){
            mint.increase();
            if (mint.GetValue()==0){
                hour.increase();
            }
            System.out.printf("%02d:%02d\n",hour.GetValue(),mint.GetValue());
        }
    }

    public static void main(String[] args) {
        clock obj = new clock();
        obj.start();
    }
}
