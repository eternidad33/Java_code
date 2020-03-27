package test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/27 22:44
 * <br>描述
 */
public class ResourceBundledemo {
    public static void main(String[] args) {
        Locale loc=new Locale("en","US");
        ResourceBundle resourceBundle=ResourceBundle.getBundle("test.Message",loc);
        String value=resourceBundle.getString("info");
        System.out.println(MessageFormat.format(value,new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
    }
}
