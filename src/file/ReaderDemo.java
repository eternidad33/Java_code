package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 21:24
 * <br>描述
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:" + File.separator + "hello" + File.separator + "test.txt");
        if (file.exists()) {
            Reader reader = new FileReader(file);
            char[] data = new char[1024];
            int len = reader.read(data);
            System.out.println("读取内容：" + new String(data, 0, len));
            reader.close();
        }
    }
}
