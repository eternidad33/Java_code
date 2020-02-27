/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String str = new String("helloJava");
        String str1=new String("Hellojava");
        System.out.println(str.equals(str1));//区分大小写比较
        System.out.println(str.equalsIgnoreCase(str1));//不区分大小写比较
        System.out.println(str.compareTo(str1));//字符串的大小的比较，'h'-'H'
        System.out.println(str.compareToIgnoreCase(str1));//忽略大小写的字符串大小比较
        System.out.println(str1.compareTo(str));
        System.out.println(str1.compareToIgnoreCase(str));

    }

}
