package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/7 20:56
 */

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> person = new LinkImpl<>();
        System.out.println("【增加之前】" + person.size() + ",是否为空：" + person.isEmpty());
        person.add("hello");
        person.add("java");
        person.add("!");
        person.add("Hello");
        person.add("Horld");
        person.add("!");
        System.out.println("【增加之后】" + person.size() + ",是否为空：" + person.isEmpty());
        person.remove("Hello");
        person.clean();
        System.out.println("【增加之后】" + person.size() + ",是否为空：" + person.isEmpty());
//        for (Object obj : person.toArray()) {
//            System.out.println(obj);
//        }
//        System.out.println("--------------------------------");
//        System.out.println(person.get(0));
//        System.out.println(person.get(1));
//        System.out.println(person.get(2));
//        person.set(1, "Python");
//        System.out.println(person.get(1));
//        System.out.println(person.contains("hello"));
//        System.out.println(person.contains("java"));
    }
}
