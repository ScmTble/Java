package scmtble.thrday;

public class display {
    private int value = 0;
    private int limit = 0;

    display(int limit){
        this.limit = limit;
    }

    public void increase(){
        this.value++;
        if (this.value==this.limit){
            this.value = 0;
        }
    }

    public int GetValue(){
        return this.value;
    }

    public static void main(String[] args) {
        display dis1 = new display(10);
        while (true){
            dis1.increase();
            System.out.println(dis1.GetValue());
        }
    }
}
