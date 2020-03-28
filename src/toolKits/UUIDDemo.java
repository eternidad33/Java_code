package toolKits;

import java.util.UUID;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/28 14:20
 * <br>描述
 */
public class UUIDDemo {
    public static void main(String[] args) {
        UUID uuid=new UUID(123456,789456);
        String str=uuid.toString();
        System.out.println(UUID.fromString(str));
    }
}
