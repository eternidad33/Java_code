package file;

import java.io.IOException;
import java.io.InputStream;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 17:52
 * <br>描述
 *
 * @author Vigilr
 */
public class SystemIODemo {
    public static void main(String[] args) throws IOException {
        InputStream input=System.in;
        System.out.println("请输入信息：");
        byte[] data=new byte[1024];
        int len=input.read(data);
        System.out.println("输出信息为："+new String(data,0,len));
    }
}
