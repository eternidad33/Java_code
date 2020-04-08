package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>创建时间 2020/4/8 9:43
 * <br>描述
 *
 * @author Vigilr
 */
public class B {
    public static B t1 = new B();
    public static B t2 = new B();

    {
        System.out.println("【构造块】");
    }

    static {
        System.out.println("【静态块】");
    }

    public static void main(String[] args) throws InterruptedException {
//        B t=new B();
        final Object obj = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                        System.out.println("Thread 1 wake up.");
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(1000);//We assume thread 1 must start up within 1 sec.
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    obj.notifyAll();
                    System.out.println("Thread 2 sent notify.");
                }
            }
        };
        t2.start();
    }
}
