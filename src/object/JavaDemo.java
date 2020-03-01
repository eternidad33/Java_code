package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class base {
    public void print() {
        System.out.println("我是父类");
    }

    public void f() {
        System.out.println("父类特有的方法");
    }
}

class son1 extends base {
    @Override
    public void print() {
        System.out.println("我是子类1");
    }

    public void print1() {
        System.out.println("父类没有的方法1");
    }
}

class son2 extends base {
    @Override
    public void print() {
        System.out.println("我是子类2");
    }
}

public class JavaDemo {

    public static void main(String[] args) {

        base f = new son1();  //向上转型
        f.print(); //打印我是子类
        if (f instanceof son1) {
            son1 s = (son1) f;//向下转型
            s.print1();
        }
        fun(new son2());
        fun(new son1());
//        System.out.println(f instanceof base);
//        System.out.println(f instanceof son1);
//        System.out.println(s instanceof base);
//        System.out.println(s instanceof son1);
    }

    public static void fun(base b) {
        b.print();
    }
}
