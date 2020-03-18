package set;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * 项目名 Java_code
 * <br>包名 set
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/18 10:57
 * <br>描述
 */
public class SetDemo {
    public static void main(String[] args) {
//        Set<String> all=new HashSet<>();
        Set<String> all=new TreeSet<>();
        all.add("hello");
        all.add("hello");
        all.add("java");
        all.add("!");
        all.forEach(System.out::print);
    }
}
