import java.util.Scanner;

public class tp {
	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int s2=fact(n);
		System.out.println(n+"的阶乘为：");
		System.out.println(s2);
	}
	public static int fact(int n) {
		int fact=1;
		/*for循环
		 * for(int i=1;i<=n;i++) {
			fact=fact*i;
		}*/
		/*while循环
		 * int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}*/
		/*
		int i=1;
		do {
			fact*=i;
			i++;
		}while(i<=n);
		return fact;
		*/
		if(n==1)
			return 1;
		else
			return fact(n-1)*n;
	}
}
