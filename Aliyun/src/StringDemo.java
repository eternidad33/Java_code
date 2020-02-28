/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-27 9:29 pm
 */
public class StringDemo {

    public static void main(String[] args) {

        String user="2020111-photo-秦始皇.png";
        int startIndex=user.indexOf("-",user.indexOf("photo"))+1;
        int endIndex=user.lastIndexOf(".");
        System.out.println(user.substring(startIndex,endIndex));


    }

}
