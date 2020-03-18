package set;

import java.util.HashSet;
import java.util.Set;

/**
 * 项目名 Java_code
 * <br>包名 set
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/18 10:57
 * <br>描述
 */
public class SetDemo {
    public static void main(String[] args) {
        Set all= new HashSet();
        all.add(new String("hello"));
        all.add(new String("hello"));
        all.add("Java");
        System.out.println(all);
    }
}
