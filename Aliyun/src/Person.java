/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-25 6:24 pm
 */
class Car {
    private String name;
    private double price;
    private Person per;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }
}

public class Person {
    private String name;
    private int age;
    public static String country = "中华民国";
    private Car car;

    public String getName() {
        return name;
    }


    public Person() {
        System.out.println("【构造方法】：构造方法执行");
    }

    public Person(String name) {
        this();//调用无参构造
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);//调用单参构造
        this.age = age;
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

    public void tell() {
        System.out.println("\n姓名：" + name + "\n年龄：" + age + "\n国家：" + country);
    }

    public static void main(String[] args) {
        Person per = new Person("张三", 15);
        Car car = new Car("BMW", 15000.00);
        car.setPer(per);
        car.getPer().tell();


    }
}
