/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {
    public static void main(String[] args) {

        String str = new String("hellojava");
        char result[] = str.toCharArray();//将字符串转化为字符数组
        for(int x=0;x<result.length;x++)
            result[x]-=32;
        System.out.println(result);
    }
}
