package scmtble.day12;

public class TestThread {
    public static void main(String[] args) {
        RunTest ts = new RunTest();
        ts.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunTest extends Thread{


    public void Hello(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        Hello();
    }
}