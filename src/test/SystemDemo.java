package test;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 20:07
 * <br>描述
 */
public class SystemDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("【回收】对象释放");
        throw new Exception("对象被回收，抛出异常");
    }

    public static void main(String[] args) {
        SystemDemo sys = new SystemDemo();
        sys = null;
        System.gc();
        //获取开始时间
        long start = System.currentTimeMillis();
        System.out.println("【程序开始执行】当前时间为:" + start);
        String str = "";
        for (int i = 0; i < 30000; i++) {
            str += i;
        }
        //获取结束时间
        long end = System.currentTimeMillis();
        System.out.println("【程序结束执行】当前时间为:" + start);
        System.out.println("【操作用时】" + (end - start) + "ms");
    }
}
