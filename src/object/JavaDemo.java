package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Outer{
    private String msg="外部类属性";
    public void fun(){
        Inner in=new Inner();   //先实例化内部类对象，在调用内部类方法
        in.print();
    }
    class Inner{//内部类
        public void print(){
            System.out.println("【内部类调用】"+Outer.this.msg); //内部类调用外部类的属性
        }
    }
}

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Outer out=new Outer();
        out.fun();
    }
}
