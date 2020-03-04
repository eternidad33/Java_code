package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IInfo {
    String getInfo();
}

enum Color implements IInfo {
    RED("红色"), BLUE("蓝色"), GREEN("绿色");
    private String title;

    private Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public String getInfo() {
        return this.title;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        IInfo i = Color.BLUE;
        System.out.println(i.getInfo());
    }
}
