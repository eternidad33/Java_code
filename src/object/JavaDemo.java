package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class ServerException extends RuntimeException {
    public ServerException(String msg) {
        super(msg);
    }
}
class Service {
    public static void count(int num) throws Exception {
        if (num > 1000) {
            throw new ServerException("服务器人数过多");
        } else {
            System.out.println("服务器正常工作");
        }
    }
}

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Service.count(100);
        Service.count(1001);
    }
}
