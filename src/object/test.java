package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-04 10:52 am
 */
import util.Message;//导入其他包的类
public class test {
    public static void main(String[] args) {
        Message msg=new Message();
        msg.setContent("hello java");
        System.out.println(msg.getContent());
    }
}
