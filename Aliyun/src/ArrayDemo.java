/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 5:31 pm
 */
class ArrayUtil{
    public int getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    private int sum;
    private double avg;
    private int min;
    private int max;
    public ArrayUtil(int[] data){
        this.sum=0;
        this.max=data[0];
        this.min=data[0];
        for(int num:data){
            this.sum+=num;
            if(num>this.max)
                this.max=num;
            if(num<this.min)
                this.min=num;
        }
        this.avg=this.sum/data.length;
    }

    public static int[] initArray(){
        int arr[]=new int[]{3,2,1,5,4,10,9,8,7,6};
        return arr;
    }


    public static int[] sort(int data[]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return data;
    }

    public static int[] reverse(int data[]){
        int head=0;
        int tail=data.length-1;
        for(int i=0;i<data.length/2;i++){
            int temp=data[head];
            data[head]=data[tail];
            data[tail]=temp;
            head++;
            tail--;
        }
        return data;
    }

    public static void printArray(int[] temp){
        for(int t:temp)
            System.out.print(t+",");
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        int data[]=ArrayUtil.initArray();
        ArrayUtil util=new ArrayUtil(data);
//        System.out.println("数组的和为："+util.getSum());
//        System.out.println("数组的平均值为："+util.getAvg());
//        System.out.println("数组的最大值为："+util.getMax());
//        System.out.println("数组的最小值为："+util.getMin());
        ArrayUtil.sort(data);
        ArrayUtil.reverse(data);
        ArrayUtil.printArray(data);
    }


}
