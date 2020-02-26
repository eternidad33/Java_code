/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 5:31 pm
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int dataA[]=new int[]{1,2,3,4,5,6,7,8,9};
        int dataB[]=new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataA,5,dataB,5,3);
        printArray(dataB);
        System.out.println();
        printArray(dataA);
    }
    public static void printArray(int[] data){
        for (int num :
                data) {
            System.out.print(num+",");
        }
    }
}
