
public class asd {
	public static void main(String[] args){
		int n=4;
		int jz[][]=new int[n][n];
		int num=1;
		System.out.println("顺时针方向为：");
		//顺时针
		for(int i=0;i<n/2+1;i++)
		{
			//上边
			for(int j=i;j<=n-i-1;j++){
				jz[i][j]=num++;
			}
			//右边
			for(int j=i+1;j<=n-i-1;j++){
				jz[j][n-i-1]=num++;
			}
			//下边
			for(int j=n-i-2;j>=i;j--){
				jz[n-i-1][j]=num++;
			}
			//左边
			for(int j=n-i-2;j>=i+1;j--){
				jz[j][i]=num++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(jz[i][j]+"\t");
			}
			System.out.println();
		}
		int num2=1;
		System.out.println("逆时针方向为：");
		for(int i=0;i<n/2+1;i++){
			//左边
			for(int j=i;j<=n-i-1;j++){
				jz[j][i]=num2++;
			}
			//下边
			for(int j=i+1;j<=n-i-1;j++){
				jz[n-i-1][j]=num2++;
			}
			//右边
			for(int j=n-i-2;j>=i;j--){
				jz[j][n-i-1]=num2++;
			}
			//上边
			for(int j=n-i-2;j>=i+1;j--){
				jz[i][j]=num2++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(jz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
