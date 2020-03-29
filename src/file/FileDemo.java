package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 16:41
 * <br>描述
 */
class MathUtil{
    private MathUtil(){}
    public static double round(double num,int scale){
        return Math.round(num*Math.pow(10,scale))/Math.pow(10,scale);
    }
}
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file=new File("F:"+File.separator+"com"+File.separator+"abc"+File.separator+"a"+"a.txt");
//        if (!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        if (file.exists()){
//            file.delete();
//        }else {
//            if (file.createNewFile()){
//                System.out.println("成功创建文件");
//            }
//        }
//        File file=new File("F:"+File.separator+"my.png");
//        System.out.println("文件是否可读："+file.canRead());
//        System.out.println("文件是否可写："+file.canWrite());
//        System.out.println("文件大小："+MathUtil.round(file.length()/1024/1024,3)+"MB");
//        System.out.println("最后的修改时间："+new SimpleDateFormat("yyyy-MM-dd").format(file.lastModified()));
//        System.out.println("是否为目录："+file.isDirectory());
//        System.out.println("是否为文件："+file.isFile());
        File file1=new File("F:"+File.separator);
        if (file1.isDirectory()){
            File[] result= file1.listFiles();
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }

    }
}
