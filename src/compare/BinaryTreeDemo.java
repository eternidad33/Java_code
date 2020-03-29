package compare;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * 项目名 Java_code
 * <br>包名 compare
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 11:44
 * <br>描述
 */
class Person implements Comparable<Person> {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * name : z
     * age : 5
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
        final StringBuffer sb = new StringBuffer("\nPerson{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(@NotNull Person o) {
        return this.age - o.age;
    }
}

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree<Person> tree = new BinaryTree<>();
        tree.add(new Person("张三", 15));
        tree.add(new Person("李四", 13));
        tree.add(new Person("王五", 25));
        tree.add(new Person("马六", 9));
        System.out.println(Arrays.toString(tree.toArray()));
    }
}
