package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 项目名 Java_code
 * <br>包名 thread
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/24 20:14
 * <br>描述
 */
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程执行，x=" + i);
        }
        return "线程执行完毕";
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
        new Thread(futureTask).start();
        System.out.println("线程返回数据:" + futureTask.get());
    }
}
