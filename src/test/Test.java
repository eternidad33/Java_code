package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/19 15:57
 * <br>描述
 */
public class Test {
    static boolean out(char c) {
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (out('A'); out('B')&&(i<2); out('C')){
            i++;
            out('D');
        }
    }
}
