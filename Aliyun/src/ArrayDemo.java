/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 5:31 pm
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int a[] = new int[3];
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        a[0]=10;a[1]=20;a[2]=30;
        for (int teep : a) {
            System.out.println(teep);
            System.out.println("HelloWorld!");
        }
//        int a[]=null;
//        System.out.println(a[1]);//Exception in thread "main" java.lang.NullPointerException

    }
}
