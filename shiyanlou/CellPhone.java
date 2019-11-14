public class CellPhone extends TelePhone{
    @Override
    public void call(){
        System.out.println("我可以打电话了");
    }
    @Override
    public void message(){
        System.out.println("我可以发短信了");
    }
    public static void main(String args[]){
        CellPhone cp=new CellPhone();
        cp.call();
        cp.message();
    }
}