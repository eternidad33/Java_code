import java.util.Arrays;
public class SystemDemo{
    public static void main(String[] args){
        int a[]={7,8,9,10,11};
        int b[]={1,2,3,4,5,6};
        System.arraycopy(a, 1, b, 2, 3);
        System.out.println(Arrays.toString(b));
        System.out.println("当前时间：" + System.currentTimeMillis());
        System.out.println("java版本信息：" + System.getProperty("java.version"));
        System.gc();
        System.exit(0);
    }
}