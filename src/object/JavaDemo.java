package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Int {
    private int data;

    public Int(int data) {
        this.data = data;
    }

    public int intValue() {
        return this.data;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        Int temp = new Int(10);
        int x = temp.intValue();
        System.out.println(x);

    }

}
