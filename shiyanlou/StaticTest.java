public class StaticTest{
    public static String string="shiyanlou";
    public static void main(String[]args){
        System.out.println(StaticTest.string);
        StaticTest sta=new StaticTest();
        System.out.println(sta.string);

    }
}