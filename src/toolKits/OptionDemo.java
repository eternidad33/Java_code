package toolKits;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * 项目名 Java_code
 * <br>包名 toolKits
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/28 14:36
 * <br>描述
 */
interface IMessage {
    public String getContent();
}

class MessageImpl implements IMessage {
    @Override
    public String getContent() {
        return "Hello Java!";
    }
}

class MessageUtil {
    private MessageUtil() {
    }

    public static Optional<IMessage> getMessage() {
        return Optional.of(new MessageImpl());
    }

    public static void useMessage(IMessage msg) {
        if (msg != null) {
            System.out.println(msg.getContent());
        }
    }
}

public class OptionDemo {
    public static void main(String[] args) {
        //获取数据
        IMessage temp=MessageUtil.getMessage().orElse(null);
        MessageUtil.useMessage(temp);
    }
}
