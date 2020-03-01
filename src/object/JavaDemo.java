package object;

import com.sun.org.apache.xerces.internal.xinclude.XPointerSchema;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class A {
    public String name;
    public int id;

    public A() {
        name = "vigilr";
        id = 1;
    }

    @Override
    public String toString() {

        return "name:" + this.name + ",id: " + this.id;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        Object obj = new A();
        if (obj instanceof A) {
            A a = (A) obj;
            System.out.println("向下转型完毕");
        }
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());//object.A@16d3586
    }

}
