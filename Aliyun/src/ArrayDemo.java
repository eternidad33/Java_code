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
        int sum = 0;
        int min=data[0];
        int max=data[0];
        double avg = 0;
        for(int num:data){
            sum+=num;
            if(num>max)
                max=num;
            if(num<min)
                min=num;
        }
        avg=sum/data.length;
        System.out.println("数组的和为："+sum);
        System.out.println("数组的平均值为："+avg);
        System.out.println("数组的最大值为："+max);
        System.out.println("数组的最小值为："+min);

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
