package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/19 16:00
 * <br>描述
 */
public class Sub extends Super{
    public Sub(String name) {
        super(name);
    }

    public Sub() {
        super();
    }

    @Override
    public void fun(){
        System.out.println("hello sub"+name);
    }
}
