/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 5:31 pm
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int data[]=initArray();
        printArray(data);
    }
    public static int[] initArray(){
        int arr[]=new int[]{1,2,3,4,5};
        return arr;
    }
    public static void printArray(int[] temp){
        for(int t:temp)
            System.out.println(t);
    }
}
