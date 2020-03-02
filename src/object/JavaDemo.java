package object;

import com.sun.org.apache.xerces.internal.xinclude.XPointerSchema;

import java.util.Objects;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
abstract class Message{
    private String type;
    public abstract String getInfo();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class DatabaseMessage extends Message{

    @Override
    public String getInfo() {
        return "数据库连接信息";
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        Message msg=new DatabaseMessage();
        System.out.println(msg.getInfo());
    }

}
