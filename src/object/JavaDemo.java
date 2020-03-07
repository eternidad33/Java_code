package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IMessage{
    public void send();
    public static IMessage getInstance(){
        return new IMessage() {
            @Override
            public void send() {
                System.out.println("helloJava");
            }
        };
    }
}
public class JavaDemo {
    public static void main(String[] args) throws Exception {
        IMessage.getInstance().send();
    }
}
