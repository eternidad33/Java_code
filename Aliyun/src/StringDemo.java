/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String str = new String("helloJava,Java");
        System.out.println(str.replaceAll("Java", "Python"));//将全部的Java替换成Python
        System.out.println(str.replaceFirst("Java", "Python"));//将第一个Java替换成Python
    }

}
