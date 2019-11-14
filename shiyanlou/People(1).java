public class People{
    private String name="Lilei";
    static String ID="510222xxx1112XXX";
    public static class Student{
        String ID="20171234";
        public void stuinfo(){
            System.out.println("访问外部类中的name：" + (new People().name));
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }
    public static void main(String[]args){
        Student b=new Student();
        b.stuinfo();
    }
}