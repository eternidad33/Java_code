public class Draw{
    public static void main(String[] args){
        int num=2;
        switch(num){
            case 1:
                System.out.println("摇到一等奖");
                break;
            case 2:
                System.out.println("摇到二等奖");
                break;
            case 3:
                System.out.println("摇到三等奖");
                break;
            default:
                System.out.println("没有摇到奖");
        }
    }
}