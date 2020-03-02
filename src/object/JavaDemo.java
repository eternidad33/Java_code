package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
abstract class Action{
    public static final int EAT=1;
    public static final int WORK=3;
    public static final int SLEEP=5;
    public void command(int code){
        switch (code){
            case EAT:{
                this.eat();
                break;
            }
            case SLEEP:{
                this.sleep();
                break;
            }
            case WORK:{
                this.work();
                break;
            }
            case EAT+SLEEP+WORK:{
                this.eat();
                this.work();
                this.sleep();
                break;
            }
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}

class RobotAction extends Action{

    @Override
    public void eat() {
        System.out.println("机器人充电");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人重复工作");
    }
}

class PigAction extends Action{

    @Override
    public void eat() {
        System.out.println("猪吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("猪吃完就睡");
    }

    @Override
    public void work() {

    }
}
class PersonAction extends Action{

    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人在床上睡觉");
    }

    @Override
    public void work() {
        System.out.println("人有很多工作");
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        Action robotac=new RobotAction();
        Action pigac=new PigAction();
        Action perac=new PersonAction();
        System.out.println("========机器人的行为========");
        robotac.command(Action.EAT);
        robotac.command(Action.WORK);
        System.out.println("=========猪的行为===========");
        pigac.command(Action.EAT);
        pigac.command(Action.SLEEP);
        System.out.println("==========人的行为==========");
        perac.command(Action.EAT);
        perac.command(Action.WORK);
        perac.command(Action.SLEEP);
    }

}
