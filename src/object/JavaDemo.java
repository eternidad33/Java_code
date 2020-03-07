package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface Ichanel{
    public void send();
    abstract class AbstractMessage{
        public abstract String getContent();
    }
}
class ChanelImpl implements Ichanel{

    @Override
    public void send() {
        AbstractMessage msg=new Message();
        System.out.println(msg.getContent());
    }
    class Message extends AbstractMessage{

        @Override
        public String getContent() {
            return "hellojava";
        }
    }
}
public class JavaDemo {
    public static void main(String[] args) throws Exception {
    Ichanel msg=new ChanelImpl();
    msg.send();
    }
}
