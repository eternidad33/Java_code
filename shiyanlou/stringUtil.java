import java.util.Scanner;
public class stringUtil{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        StringBuilder stringbuilder=new StringBuilder(a);
        System.out.print("空格符索引为");
        for(int i=0;i<stringbuilder.length();i++){
            if(stringbuilder.charAt(i)==' '){
                System.out.print(i+' ');
                stringbuilder.deleteCharAt(i);
                i--;
            }
            else{
                stringbuilder.charAt(i);
            }
        }
        System.out.println(stringbuilder.toString());
    }
}