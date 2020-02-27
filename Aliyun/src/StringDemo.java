/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String str = new String("hellojava");
        System.out.println(isNumber(str) ? "该字符串全为数字" : "该字符串不全为数字");
    }

    private static boolean isNumber(String str) {
        char result[] = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] < '0' || result[i] > '9')
                return false;
        }
        return true;
    }

}
