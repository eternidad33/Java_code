/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String name="小明";
        int age=10;
        double score=59.123456789;
        String str=String.format("姓名：%s，年龄：%d，分数：%5.2f",name,age,score);//format是一个静态方法
        System.out.println(str);

    }

}
