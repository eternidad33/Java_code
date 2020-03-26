package thread;

/**
 * 项目名 Java_code
 * <br>包名 thread
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/25 18:24
 * <br>描述
 */
class th implements Runnable {
    public static int ticket = 10;
    public synchronized boolean sale(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "当前票数为：" + ticket--);
            return true;
        } else {
            System.out.println("票卖光了");
            return false;
        }
    }
    @Override
    public void run() {
        while (this.sale()){
            ;
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        th t = new th();
        new Thread(t, "线程1").start();
        new Thread(t, "线程2").start();
        new Thread(t, "线程3").start();
    }
}
