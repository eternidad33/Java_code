/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String str = new String("helloJava");
        System.out.println(str.contains("hello"));//判断字符串中是否含有hello
        System.out.println(str.contains("Python"));
        System.out.println(str.indexOf("Java"));//查询Java是否存在于str中，存在返回首字母索引位置，不存在返回-1
        System.out.println(str.indexOf("python"));
        System.out.println(str.lastIndexOf("Java"));//从后向前查询
        System.out.println(str.lastIndexOf('a',7));
        String str2=new String("www.baidu.com");
        System.out.println(str2.endsWith("com"));//判断是否以com结尾
        System.out.println(str2.startsWith("www"));//判断是否以www开头
        System.out.println(str2.startsWith(".",3));
    }

}
