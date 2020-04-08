package vo;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * 项目名 Java_code
 * <br>包名 vo
 * <br>创建时间 2020/4/8 16:17
 * <br>描述
 *
 * @author Vigilr
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all, "Java", "Python", "JSP", "JSON", "JavaScript", "Ruby", "CSS");
        Stream<String> stream = all.stream();
//        System.out.println(stream.count());
        List<String> results =
                stream.filter((ele) -> ele.toLowerCase().contains("j")).skip(1).limit(2).collect(Collectors.toList());
        System.out.println(results);
    }
}
