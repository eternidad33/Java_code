package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 21:07
 * <br>描述
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:" + File.separator + "hello" + File.separator + "test.txt");
        //父目录不存在
        if (!file.getParentFile().exists()) {
            //创建目录
            file.getParentFile().mkdirs();
        }
        Writer writer=new FileWriter(file);
        writer.write("Hello Java!\r\n");
        writer.append("哈哈哈，追加上了字符串了");
        writer.close();
    }
}
