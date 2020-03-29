package file;

import java.io.File;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 17:37
 * <br>描述
 */
public class ListFile {
    public static void main(String[] args) {
        File file=new File("F:"+File.separator);
        listDir(file);
    }
    public static void listDir(File file){
        if (file.isDirectory()){
            File[] results=file.listFiles();
            if (results!=null){
                for (int i = 0; i < results.length; i++) {
                    listDir(results[i]);
                }
            }
        }
        System.out.println(file);
    }
}
