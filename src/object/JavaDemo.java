package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IMessge<T> {
    public String content(T t);
}

class Radio implements IMessge<String> {
    @Override
    public String content(String t) {
        return "hello " + t;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        IMessge<String> msg = new Radio();
        System.out.println(msg.content("java"));
    }
}
