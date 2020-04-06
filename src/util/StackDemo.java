package util;

import java.util.Stack;

/**
 * 项目名 Java_code
 * <br>包名 util
 * <br>创建时间 2020/4/6 14:30
 * <br>描述
 *
 * @author Vigilr
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> all = new Stack<>();
        all.push("A");
        all.push("B");
        all.push("C");
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
    }
}
