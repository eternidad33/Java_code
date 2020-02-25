/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-25 6:24 pm
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public Person(){
        System.out.println("产生新的对象");
    }
    public Person(String name){
        this();//调用无参构造
        this.name=name;
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

    public void tell(){
        System.out.println("姓名："+name+"\n年龄："+age);
    }
}
