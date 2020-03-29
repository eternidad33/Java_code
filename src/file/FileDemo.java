package file;

import java.io.File;
import java.io.IOException;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 16:41
 * <br>描述
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\a.txt");
        if (file.exists()){
            file.delete();
        }else {
            if (file.createNewFile()){
                System.out.println("成功创建文件");
            }
        }
    }
}
