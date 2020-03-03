package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IUsb{
    public boolean check();
    public void work();
}

class computer{
    public void plugin(IUsb usb){
        if(usb.check()){
            usb.work();
        }else {
            System.out.println("该设备不能正常工作");
        }
    }
}
class Keyboard implements IUsb{

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("键盘开始打字");
    }
}
class print implements IUsb{

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void work() {
        System.out.println("打印机开始工作");
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        computer a=new computer();
        a.plugin(new Keyboard());//插入键盘
        a.plugin(new print());//插入打印机
    }

}
