package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-28 11:43 am
 */

public class Student extends Person{
    private String school;
    public Student(String name){
        setName(name);
    }
    public Student(String name,int age ,String school){
        super(name,age);
        this.school=school;
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void main(String[] args) {
        Student stu=new Student("小明");

        System.out.println("姓名："+stu.getName()+"，年龄："+stu.getAge()+"，学校："+stu.getSchool());
    }
}
