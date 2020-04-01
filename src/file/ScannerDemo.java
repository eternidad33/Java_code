package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 项目名 Java_code
 * <br>包名 file
 * <br>创建时间 2020/4/1 18:59
 * <br>描述
 *
 * @author Vigilr
 */
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan=new Scanner(new File("F:"+File.separator+"a.txt"));
        scan.useDelimiter("\n");
        while (scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }
}
