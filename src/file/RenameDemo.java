package file;

import java.io.File;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 17:59
 * <br>描述
 */
public class RenameDemo {
    public static void main(String[] args) {
        File file = new File("F:" + File.separator + "test");
        long start = System.currentTimeMillis();
        renameDir(file);
        long end = System.currentTimeMillis();
        System.out.println("重命名所花费的时间：" + (end - start) + "ms");
    }

    public static void renameDir(File file) {
        if (file.isDirectory()) {
            File[] results = file.listFiles();
            if (results != null) {
                for (int i = 0; i < results.length; i++) {
                    renameDir(results[i]);
                }
            }
        } else {
            if (file.isFile()) {
                String fileName=null;
                if (file.getName().contains(".")){
                    fileName=file.getName().substring(0,file.getName().lastIndexOf('.'))+".png";
                }else {
                    fileName=file.getName();
                }
                File newFile=new File(file.getParent(),fileName);
                file.renameTo(newFile);
            }
        }
    }
}
