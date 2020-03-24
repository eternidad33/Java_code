package thread;

/**
 * 项目名 Java_code
 * <br>包名 thread
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/24 18:43
 * <br>描述
 */
class MyThread implements Runnable {
    private String title;
    private int ticket=5;
    MyThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (this.ticket>=0){
                System.out.println(this.title+"卖票："+this.ticket--);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("线程1");
//        new Thread(myThread).start();
    }
}
