package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vigilr
 * @project Java_code
 * @package list
 * @time 2020/3/17 17:05
 */
public class ListDemo {
    public static void main(String[] args) {
//        List<String> all=new ArrayList<>();
//        System.out.println("all是否为空"+all.isEmpty());
//        all.add("hello");
//        all.add("Java");
//        all.add("!");
//        System.out.println("all是否为空"+all.isEmpty());
//        all.forEach((str)->{
//            System.out.print(str+" ");
//        });
        List<Person> all = new ArrayList<>();
        ListTest.lightest(all);

    }
}
