package object;

import com.sun.org.apache.xerces.internal.xinclude.XPointerSchema;

import java.util.Objects;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class person {
    private String name;
    private int age;

    public person(String name, int age) {
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
        final StringBuffer sb = new StringBuffer("person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {//判断对象是否为null
            return false;
        }
        if (this == obj) {//判断是不是同一地址
            return true;
        }
        if (!(obj instanceof person)) {//判断obj是否转换为person
            return false;
        }
        person per = (person) obj;
        return this.name.equals(per.name) && this.age == this.age;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        person a=new person("张三",10);
        person b=new person("张三",10);
        System.out.println(a.equals(b));
        System.out.println(a.equals("张三"));
        System.out.println(a.toString());
    }

}
