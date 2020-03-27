package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 20:38
 * <br>描述
 */
class Member implements Cloneable{

    /**
     * name : s
     * age : 15
     */

    private String name;
    private int age;

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
        final StringBuffer sb = new StringBuffer("Member{");
        sb.append(super.toString()).append(",name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Member memberA=new Member("张三",14);
        Member memberB=(Member) memberA.clone();
        System.out.println(memberA);
        System.out.println(memberB);
    }
}
