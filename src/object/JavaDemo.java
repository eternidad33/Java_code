package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */


public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
//            System.out.println("程序异常"+e);
            e.printStackTrace();
        }finally {
            System.out.println("都执行");
        }
        System.out.println("程序执行结束");
    }
}
