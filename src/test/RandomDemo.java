package test;

import java.util.Arrays;
import java.util.Random;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 21:09
 * <br>描述
 */
public class RandomDemo {
    public static boolean isUse(int[] nums,int num){
        if (num==0){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==num){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random random=new Random();
        int[] data=new int[10];
        int foot=0;
        while (foot<10){
            int num=random.nextInt(100);
            if(RandomDemo.isUse(data,num)){
                data[foot++]=num;
            }
        }
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));;
    }
}
