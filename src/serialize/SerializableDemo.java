package serialize;

import java.io.Serializable;

/**
 * 项目名 Java_code
 * <br>包名 Serialize
 * <br>创建时间 2020/4/1 19:57
 * <br>描述
 *
 * @author Vigilr
 */
class Person implements Serializable {
    //Person类产生的每一个对象都可以实现二进制的数据传输，属于可以被序列化的程序类
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
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

public class SerializableDemo {
}
