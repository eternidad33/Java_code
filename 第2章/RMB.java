package qweqewqe;
import java.util.Scanner;
public class RMB                               	//人民币类
{
	public static boolean end1=false;
	public static boolean end2=false;
	public static boolean end3=false;
    //返回金额x的中文大写形式字符串
    public static String toString(double x)
    {
        String yuan="亿千百拾万千百拾元角分";
        String digit="零壹贰叁肆伍陆柒捌玖"; 
        String result=""; 
        int y=(int)(x*100);    //浮点数扩充100倍后取整（保留两位小数）
        //从y的低位到高位，每次获得y个位转换成中文金额，连接成字符串        	
        if(y%100==0){
        	end1=true;
        }
        int count=0;
        if(y/100%10==0)
        	end3=true;
        for(int j=y/1000;j>=0;j/=10){
        	if(y%10==0 && y%100==0)
        		count+=1;
        }
        if(count!=0)
        	end2=true;
        for (int i=yuan.length()-1;  y>0 && i>0;  i--, y/=10)
        {
        	if(end1){
        		result="整";
        		y/=100;
        		i-=2;
        		end1=false;
        	}
        	
        	if(end2){
        		y/=(count*100);
        		i-=(count-1);
        		end2=false;
        		result="零"+result;
        	}
        	
        	if(end3){
        		y/=10;
        		i-=1;
        		end3=false;
        	}
        	
			result = ""+digit.charAt(y % 10)+yuan.charAt(i)+result;
        }
        return result;
    }
	public static void main(String[] args)
    {
    	System.out.println("请输入钱数：");
		@SuppressWarnings("resource")
		Scanner asd = new Scanner(System.in);
		float x=asd.nextFloat();    	
    	String result=toString(x);
    	System.out.println("转换为大写后的结果为");
    	System.out.println(result);
    }
}
