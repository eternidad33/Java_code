package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
@FunctionalInterface
        //函数式接口
interface IFunction <R>{
    public R contracter(String name,int age);
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
public class JavaDemo {
    public static void main(String[] args) throws Exception {
//        IFunction<String, Integer> fun = String::valueOf;//引用静态方法
//        IFunction fun="hellojava"::toUpperCase;//实例化对象的方法
//        IFunction<String> fun=String::compareTo;//引用类的普通方法
        IFunction<Person> fun=Person::new;//引用构造函数
        Person p=fun.contracter("张三",15);
        System.out.println(p);
    }
}