import java.util.Scanner;
public class ScannerDemo{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(s);
        int i=in.nextInt();
        System.out.println(i);
        while(!in.hasNext("exit")){
            System.out.println(in.nextLine());
        }
        in.close();
    }
}