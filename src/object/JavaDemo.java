package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IMessage{
    public void send(String str);
}
class MessageImpl implements IMessage{
    @Override
    public void send(String str) {
        System.out.println("消息发送"+str);
    }
}
class Factory{
    public static  <T>T getInstance(String className){
        if ("messageimpl".equalsIgnoreCase(className)){
            return (T) new MessageImpl();
        }
        return null;
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg=Factory.getInstance("messageimpl");
        msg.send("java");
    }
}
