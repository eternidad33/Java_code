package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Channel{
    public void Connect(){
        System.out.println("============Channel================");
    }
}
class DatabaseChannel extends Channel{
    @Override
    public void Connect() {
        System.out.println("=========DatabaseChannel============");
    }
}

public class JavaDemo {
    @SuppressWarnings({"deprecated"})
    public static void main(String[] args) {
        DatabaseChannel dba=new DatabaseChannel();
        dba.Connect();
    }
}
