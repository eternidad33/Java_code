package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 19:57
 * <br>描述
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:" + File.separator + "hello" + File.separator + "test.txt");
        InputStream inputStream=new FileInputStream(file);
        //开辟一个缓冲区存取数据
        byte[] data=new byte[1024];
        //读取数据，全部保存在数组中
        int len=inputStream.read(data);
        System.out.println("【"+new String(data,0,len)+"】");
        inputStream.close();
    }
}
