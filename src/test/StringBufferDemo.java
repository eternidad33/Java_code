package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/26 16:32
 * <br>描述
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("baidu");
        sb.append(".com").insert(0,"www.");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
