/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {
    public static void main(String[] args) {
        String A = "hellojava";
        String B = "hellojava";
        String C=new String("hellojava");
        System.out.println(A==B);//true
        System.out.println(A==C);//false
        System.out.println(A.equals(C));//true

    }
}
