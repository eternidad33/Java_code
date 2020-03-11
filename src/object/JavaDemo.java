package object;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
public class JavaDemo {
    public static void main(String[] args) {
        TimeZone tz=TimeZone.getDefault();  //设置时区
        tz=TimeZone.getTimeZone("US/Eastern");
//        tz=TimeZone.getTimeZone("GMT+08:00");
//        System.out.println(tz.getID());
        Locale lc=Locale.JAPAN;
//        System.out.println(lc.toString());
        Calendar calender=Calendar.getInstance();
//        Date date=calender.getTime();
        System.out.println(calender.getTime());
//        System.out.println("year:"+calender.get(Calendar.YEAR));
//        System.out.println("month:"+(calender.get(Calendar.MONTH)+1));
//        System.out.println("day:"+calender.get(Calendar.DAY_OF_MONTH));
//        System.out.println("hour:"+calender.get(Calendar.HOUR));
//        System.out.println("minute:"+calender.get(Calendar.MINUTE));
        calender.set(2020,3,10,15,10,30);
        System.out.println(calender.getTime());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒");
        String str=sdf.format(calender.getTime());
        System.out.println(str);
        SimpleDateFormat sdf2=new SimpleDateFormat("a hh:mm:ss ");
//        System.out.println(sdf2.format(calender.getTime()));
        try {
            Date date=sdf.parse(str);
            System.out.println(sdf2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}