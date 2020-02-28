/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-25 6:24 pm
 */

public class Person {
    private String name;
    private int age;
    public Person(){

        System.out.println("【Person】被实例化");
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
}
