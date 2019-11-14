import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

    public static void main(String[] args) throws FileNotFoundException {
        //由方法的调用者捕获异常或者继续向上抛出
        throwsTest();

    }

    public static void throwsTest() throws FileNotFoundException {
        new FileInputStream("/home/project/shiyanlou.file");
    }
}
