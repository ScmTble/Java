package scmtble.day11;

import java.util.concurrent.*;

public class CallableTest implements Callable<Boolean> {

    // 重写Callable中的call方法
    @Override
    public Boolean call() throws Exception {
        System.out.println("Hello");
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建Callable接口的对象
        CallableTest t1 = new CallableTest();
        CallableTest t2 = new CallableTest();
        CallableTest t3 = new CallableTest();

        // 创建服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        // 提交任务
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        // 获取任务的执行结果
        Boolean res1 = r1.get();
        Boolean res2 = r2.get();
        Boolean res3 = r3.get();

        // 关闭服务
        ser.shutdownNow();
    }
}
