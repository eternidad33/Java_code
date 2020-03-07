package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface Ichanel{
    public void send();
    class ChanelImpl implements Ichanel{
        @Override
        public void send(){
            System.out.println("hello java!");
        }
    }
    public static Ichanel getInstance(){
        return new ChanelImpl();
    }
}

public class JavaDemo {
    public static void main(String[] args) throws Exception {
    Ichanel msg=Ichanel.getInstance();
    msg.send();
    }
}
