/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 5:31 pm
 */
class ArrayUtil{
    public static int sum(int ... data){
        int sum=0;
        for(int temp:data){
            sum+=temp;
        }
        return sum;
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.sum(1,2,3));
        System.out.println(ArrayUtil.sum(new int[]{1,2,3}));
    }
}
