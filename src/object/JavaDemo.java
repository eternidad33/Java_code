package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IChanel{
    public void send(Imessage msg);
    interface Imessage{
        public String getContent();
    }
}
class ChanelImpl implements IChanel{
    @Override
    public void send(Imessage msg) {
        System.out.println("发送消息"+msg.getContent());
    }
    class MessageImpl implements Imessage{
        @Override
        public String getContent() {
            return "hellojava";
        }
    }
}
public class JavaDemo {
    public static void main(String[] args) throws Exception {
        IChanel chanel=new ChanelImpl();
        chanel.send(((ChanelImpl)chanel).new MessageImpl());
    }
}
