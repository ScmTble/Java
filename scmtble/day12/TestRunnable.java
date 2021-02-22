package scmtble.day12;

public class TestRunnable {

    public static void main(String[] args) {
        test ts = new test();
        Thread thread = new Thread(ts);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("World");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class test implements Runnable{
    @Override
    public void run() {
        Hello();
    }

    public void Hello(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}