package file;

import java.io.*;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 19:17
 * <br>描述
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:" + File.separator + "hello" + File.separator + "test.txt");
        //父目录不存在
        if (!file.getParentFile().exists()) {
            //创建目录
            file.getParentFile().mkdirs();
        }
        try {
            OutputStream outputStream = new FileOutputStream(file, true);
            String str = "Hello Java!\r\n";
            outputStream.write(str.getBytes());
        } catch (IOException e) {
            System.out.println("自动关闭异常");
            e.printStackTrace();
        }
    }
}
