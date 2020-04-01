package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 18:06
 * <br>描述
 *
 * @author Vigilr
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入信息：");
        String msg = input.readLine();
        System.out.println("输入的数据为：" + msg);
    }
}
