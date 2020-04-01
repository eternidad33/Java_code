package file;

import java.io.*;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 16:21
 * <br>描述
 *
 * @author Vigilr
 */
public class ByteDemo {
    public static void main(String[] args) throws IOException {
        String str = "hello,java";
        //将数据保存到内存
        InputStream input = new ByteArrayInputStream(str.getBytes());
        //读取内存中的数据
        OutputStream output = new ByteArrayOutputStream();
        int data = 0;
        while ((data = input.read()) != -1) {
            output.write(Character.toUpperCase(data));
        }
        System.out.println(output);
        output.close();
        input.close();

    }
}
