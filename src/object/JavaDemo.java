package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IMessageWrap {//消息包装

    interface IMessage {//消息

        public String getContent();
    }

    interface IChenal {//消息通道

        public boolean connect();
    }

    public static void send(IChenal chenal, IMessage msg) {
        if (chenal.connect()) {
            System.out.println("【消息发送】" + msg.getContent());
            System.out.println("消息发送成功");
        } else {
            System.out.println("消息发送失败");
        }
    }
}

class DefaultMessage implements IMessageWrap.IMessage {

    @Override
    public String getContent() {
        return "hello java";
    }
}

class NetChneal implements IMessageWrap.IChenal {
    @Override
    public boolean connect() {
        return true;
    }
}


public class JavaDemo {
    public static void main(String[] args) throws Exception {
        IMessageWrap.send(new NetChneal(), new DefaultMessage());
    }
}
