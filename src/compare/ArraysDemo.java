package compare;

import java.util.Arrays;

/**
 * 项目名 Java_code
 * <br>包名 compare
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/28 19:11
 * <br>描述
 */
public class ArraysDemo {
    public static void main(String[] args) {
        String[] arr=new String[]{"A","S","x","B","C","V","Z","D"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
