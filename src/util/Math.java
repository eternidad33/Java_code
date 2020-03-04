package util;

/**
 * @author Vigilr
 * @project Java_code
 * @package util
 * @time 2020-03-04 11:09 am
 */
public class Math {
    public static int add(int ... args){
        int sum=0;
        for (int arg:args){
            sum+=arg;
        }
        return sum;
    }
    public static int sub(int x,int y){
        return x-y;
    }
}
