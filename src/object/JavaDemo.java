package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */

public class JavaDemo {
    public static void main(String[] args) {
        Integer nums[]=fun(1,2,3);
        for (int num:nums){
            System.out.println(num);
        }
    }
    public static <T>T[] fun(T ... args){
        return args;
    }
}
