package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Outer{
    private  String msg="helloJava";
    public void fun(long temp){
        class Inner{
            public void print(){
                System.out.println(Outer.this.msg);
                System.out.println("打印"+temp);
            }
        }
        new Inner().print();
    }
}


public class JavaDemo {
    public static void main(String[] args) throws Exception {
        new Outer().fun(1546543546);
    }
}
