public class NewObject{
    public static void main(String[] args){

        People Lilei=new People();
        Lilei.setHeight(170.0);
        Lilei.age=25;
        Lilei.sex=1;
        Lilei.printBaseMes();
        People xiaoming=new People(168,21,1);
        xiaoming.printBaseMes();
    }
}