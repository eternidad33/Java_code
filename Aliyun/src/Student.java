/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-28 11:43 am
 */
public class Student extends Person{
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("小明");
        stu.setAge(15);
        stu.setSchool("河北大学");
        System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge()+"，学校："+stu.getSchool());
    }
}
