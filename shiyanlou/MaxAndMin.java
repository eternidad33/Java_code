public class MaxAndMin{
    public static void main(String []args){
        int[]data={313, 89, 123, 323, 313, 15, 90, 56, 39};
        int maxnum=data[0];
        int minnum=data[0];
        for(int a:data){
            if(a>=maxnum)
                maxnum=a;
            if(a<=minnum)
                minnum=a;
        }
        System.out.println("最小值为"+minnum);
        System.out.println("最大值为"+maxnum);
    }
}