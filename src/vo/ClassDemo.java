package vo;

/**
 * 项目名 Java_code
 * <br>包名 vo
 * <br>创建时间 2020/4/6 10:26
 * <br>描述
 *
 * @author Vigilr
 */
public class ClassDemo {
    public static void main(String[] args) throws Exception{
        Class<?> cls=Class.forName("vo.Person");
        Object obj=cls.getDeclaredConstructor().newInstance();
        System.out.println(obj);
    }
}
