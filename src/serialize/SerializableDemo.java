package serialize;

import java.io.*;

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

public class SerializableDemo {
    private static final File SAVE_FILE = new File("F:" + File.separator + "test.person");

    public static void main(String[] args) throws Exception {
//        saveObject(new Person("张三",22));
        System.out.println(loadObject());
    }

    public static void saveObject(Object obj) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        //输出对象
        //序列化
        oos.writeObject(obj);
        oos.close();
    }

    public static Object loadObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE));
        //反序列化
        Object obj = ois.readObject();
        return obj;
    }
}
