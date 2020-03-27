package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 18:51
 * <br>描述
 */
public class RuntimeDemo {
    public static void main(String[] args) throws InterruptedException {
        //初始化Runtime对象
        Runtime run = Runtime.getRuntime();
        //输出CPU核数
        System.out.println("本机的CPU核数"+run.availableProcessors());
        System.out.println("【1】JVM最大内存" + (run.maxMemory() / 1024 / 1024) + "MB");
        System.out.println("【1】JVM总共内存" + (run.totalMemory() / 1024 / 1024) + "MB");
        System.out.println("【1】JVM剩余内存" + (run.freeMemory() / 1024 / 1024) + "MB");
        String str = "";
        for (int i = 0; i < 30000; i++) {
            str += i;
        }
        System.out.println("************处理一段程序后************");
        System.out.println("【2】JVM最大内存" + (run.maxMemory() / 1024 / 1024) + "MB");
        System.out.println("【2】JVM总共内存" + (run.totalMemory() / 1024 / 1024) + "MB");
        System.out.println("【2】JVM剩余内存" + (run.freeMemory() / 1024 / 1024) + "MB");
        run.gc();
        System.out.println("************垃圾处理后************");
        System.out.println("【3】JVM最大内存" + (run.maxMemory() / 1024 / 1024) + "MB");
        System.out.println("【3】JVM总共内存" + (run.totalMemory() / 1024 / 1024) + "MB");
        System.out.println("【3】JVM剩余内存" + (run.freeMemory() / 1024 / 1024) + "MB");
    }
}
