package toolKits;

import java.util.Base64;

/**
 * 项目名 Java_code
 * <br>包名 toolKits
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/28 17:17
 * <br>描述
 */
class StringUtil {
    private static final String SALT = "tfl";//公共颜值
    private static final int REPEAT = 5;//重复次数

    /**
     * 重复操作加密处理
     *
     * @param: [str]
     * @return: java.lang.String
     */
    public static String encode(String str) {
        String temp = str + "{" + SALT + "}";
        byte[] bytes = temp.getBytes();
        for (int i = 0; i < REPEAT; i++) {
            bytes = Base64.getEncoder().encode(bytes);
        }
        return new String(bytes);
    }

    /**
     * 解密处理
     *
     * @param: [str]
     * @return: java.lang.String
     */
    public static String decode(String str) {
        byte[] bytes = str.getBytes();
        for (int i = 0; i < REPEAT; i++) {
            bytes = Base64.getDecoder().decode(bytes);
        }
        return new String(bytes).replaceAll("\\{\\w+\\}", "");
    }
}

public class Base64Demo {
    public static void main(String[] args) {
        String str = StringUtil.encode("HelloJava");
        System.out.println(str);
        System.out.println(StringUtil.decode(str));
    }
}
