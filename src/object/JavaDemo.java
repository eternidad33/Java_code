package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IMessage {
    public static final String M = "Message";

    public default void getInfo() {
        System.out.println("hel");
    }
}

class A implements IMessage {

}

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg = new A();
        msg.getInfo();
    }

}
