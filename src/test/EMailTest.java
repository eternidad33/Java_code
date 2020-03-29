package test;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 16:15
 * <br>描述
 */
public class EMailTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(1);
        }
        System.out.println(Validator.isEmail(args[0]));
    }
}

class Validator {
    public Validator() {
    }

    public static boolean isEmail(String email) {
        if (email == null || "".equals(email)) {
            return false;
        } else {
            String regex = "\\w+@\\w+\\.\\w+";
            return email.matches(regex);
        }
    }
}
