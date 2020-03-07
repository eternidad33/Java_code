package object;

import java.util.function.*;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */

public class JavaDemo {
    public static void main(String[] args) throws Exception {
//        Function<String,Boolean> fun="hellojava"::startsWith;
//        System.out.println(fun.apply("hello"));
//        Consumer<String> fun=System.out::println;
//        fun.accept("HelloJava");
//        Supplier<String> fun="hellojava"::toUpperCase;
//        System.out.println(fun.get());
        Predicate<String> fun="hello"::equals;
        System.out.println(fun.test("hello"));
    }
}