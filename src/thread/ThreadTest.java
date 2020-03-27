package thread;

/**
 * 项目名 Java_code
 * <br>包名 thread
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/25 18:24
 * <br>描述
 */
class Resource {
    private int num = 0;
    //进行加减法的切换
    private boolean flag = true;

    public synchronized void add() throws Exception {
        if (!this.flag){
            super.wait();
        }
        Thread.sleep(100);
        this.num++;
        System.out.println("【加法操作-" + Thread.currentThread().getName() + "】，num=" + this.num);
        //加法执行完毕，进行减法操作
        this.flag=false;
        //唤醒全部等待线程
        super.notifyAll();
    }

    public synchronized void sub() throws Exception {
        if(this.flag){
            super.wait();
        }
        Thread.sleep(100);
        this.num--;
        System.out.println("【减法操作-" + Thread.currentThread().getName() + "】，num=" + this.num);
        //减法执行完毕
        this.flag=true;
        //唤醒全部等待线程
        super.notifyAll();
    }
}

//加法线程
class AddThread implements Runnable {
    private Resource resource;

    public AddThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                this.resource.add();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//减法线程
class SubThread implements Runnable {
    private Resource resource;

    public SubThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                this.resource.sub();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Resource res = new Resource();
        AddThread at = new AddThread(res);
        SubThread st = new SubThread(res);
        new Thread(at, "加法线程A").start();
        new Thread(at, "加法线程B").start();
        new Thread(st, "减法线程X").start();
        new Thread(st, "减法线程Y").start();

    }
}
