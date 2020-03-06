package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */

public class JavaDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("throw抛出的异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
