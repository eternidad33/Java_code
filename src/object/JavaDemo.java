package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
@FunctionalInterface
        //函数式接口
interface MyMath {
    public int add(int a, int b);
}

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        MyMath m = (a, b) -> a + b;
        System.out.println(m.add(1, 1));
    }
}
