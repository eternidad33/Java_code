public class SumOfEven{
    public static void main(String[] args){
        int i1=0,i2=0;
        int sum1=0,sum2=0,sum3=0;
        while(i1<=1000){
            sum1+=i1;
            i1+=2;
        }
        System.out.println("用While输出的结果为"+sum1);
        do{
            sum2+=i2;
            i2+=2;
        }while(i2<=1000);
        System.out.println("用do-While输出的结果为"+sum2);
        for(int i=0;i<=1000;i+=2){
            sum3+=i;
        }
        System.out.println("用for输出的结果为"+sum3);
    }
}