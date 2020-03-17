package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Vigilr
 * @project Java_code
 * @package list
 * @time 2020/3/17 17:06
 */
public class ListTest {
    public static void main(String[] args) {
//        List<Person> all=new LinkedList<>();
        List<Person> all = new Vector<>();
        lightest(all);
    }

    static void lightest(List<Person> all) {
        all.add(new Person("张三", 14));
        all.add(new Person("李四", 15));
        all.add(new Person("王五", 16));
        all.forEach(System.out::println);
        System.out.println(all.contains(new Person("王五", 6)));
        all.remove(new Person("王五", 16));
        all.forEach(System.out::println);
    }
}
