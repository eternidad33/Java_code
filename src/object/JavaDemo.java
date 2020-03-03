package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
interface IEat {
    public void get();
}

class RealEat implements IEat {
    @Override
    public void get() {
        System.out.println("开始吃");
    }
}

class EatProxy implements IEat {
    private IEat eat;

    public void prepare() {
        System.out.println("1. 采购食材");
        System.out.println("2. 处理食材");
    }

    public void clear() {
        System.out.println("3. 清理碗筷");
    }

    public EatProxy(IEat eat) {
        this.eat = eat;
    }

    @Override
    public void get() {
        this.prepare();
        this.eat.get();
        this.clear();
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new RealEat());
        eat.get();
    }

}
