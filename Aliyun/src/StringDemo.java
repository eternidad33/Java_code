/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
class StringUtil{
    public static String initCap(String str){//将字符串首字母大写，其余字母小写
        if(str==null||"".equals(str))
            return str;
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }
}



public class StringDemo {

    public static void main(String[] args) {
        String str1 = "hello ";
        String str2 = "Java";
        String str3="";
        System.out.println(str1.concat(str2));//字符串的连接
        System.out.println(str1.isEmpty());//判断字符串内容是否为空
        System.out.println(str3.isEmpty());
        String str4="         Hello Java     ";
        String trimStr4=str4.trim();//去掉字符串中所有空格
        System.out.println(str4.length());
        System.out.println(trimStr4.length());
        System.out.println(str4);
        System.out.println(trimStr4);
        System.out.println(str1.toUpperCase());//全部转换成大写
        System.out.println(str2.toLowerCase());//全部转换成小写
        String a="aSDDasdF";
        String b="m";
        System.out.println(StringUtil.initCap(a));
        System.out.println(StringUtil.initCap(b));


    }

}
