package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 20:54
 * <br>描述
 */
public class MathDemo {
    /**
    * 指定小数位数四舍五入
    * @param: [num, scale]
    * @return: double
    */
    public static double round(double num,int scale){
        return Math.round(num*Math.pow(10,scale))/Math.pow(10,scale);
    }

    public static void main(String[] args) {
        System.out.println(MathDemo.round(15.89645,3));
    }
}
