package file;

import java.io.*;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 17:22
 * <br>描述
 *
 * @author Vigilr
 */
public class PrintDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:" + File.separator + "a.txt");
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
        printWriter.println("姓名：张三");
        printWriter.print("年龄：");
        printWriter.println("18");
        printWriter.close();
        PrintWriter pw = new PrintWriter(new FileOutputStream(file));
        String name = "李四";
        String sex = "男";
        int age = 22;
        pw.printf("姓名：%s,性别：%s,年龄：%d", name, sex, age);
        pw.close();
        Reader reader = new FileReader(file);
        char[] data = new char[1024];
        int len = reader.read(data);
        System.out.println("读取内容：\n" + new String(data, 0, len));
        reader.close();
    }
}
