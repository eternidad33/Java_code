import java.util.Arrays;
import java.util.Random;
public class ArraysDemo{
    public static void main(String[] args){
        int[] arr=new int[10];
        Arrays.fill(arr,9);
        System.out.println("fill:"+Arrays.toString(arr));

        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(101);
        }
        System.out.println("重新赋值:"+Arrays.toString(arr));

        arr[5]=50;
        Arrays.sort(arr);
        System.out.println("sort排序后:"+Arrays.toString(arr));

        int i=Arrays.binarySearch(arr, 50);
        System.out.println("值为索引为 :"+i);

        int[] newarr=Arrays.copyOf(arr, arr.length);
        System.out.println("equals:"+Arrays.equals(arr,newarr));

    }
}

