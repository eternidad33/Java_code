import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalendarDemo{
    public static void main(String[] args){
        System.out.println("完整显示日期时间：");
        //字符串转换日期格式
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=fdate.format(new Date());
        System.out.println(str);

        //创建Calendar对象
        Calendar cal=Calendar.getInstance();
        cal.setTime(new Date());

        System.out.println("年："+cal.get(Calendar.YEAR));
        System.out.println("月："+cal.get(Calendar.MONTH));
        System.out.println("分钟："+cal.get(Calendar.MINUTE));
        System.out.println("今年的第"+cal.get(Calendar.DAY_OF_YEAR)+"天");
        System.out.println("本月的第"+cal.get(Calendar.DAY_OF_MONTH)+"天");

        cal.add(Calendar.HOUR_OF_DAY,3);
        System.out.println("三小时以后时间"+cal.getTime());

        str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(cal.getTime());
        System.out.println(str);

        cal.setTime(new Date());
        str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(cal.getTime());
        System.out.println(str);

        Calendar calnew =Calendar.getInstance();
        calnew.add(Calendar.HOUR,-5);
        System.out.println("时间比较:"+calnew.compareTo(cal));

        calnew.add(Calendar.HOUR,+7);
        System.out.println("时间比较:"+calnew.compareTo(cal));

        calnew.add(Calendar.HOUR,-2);
        System.out.println("时间比较:"+calnew.compareTo(cal));

        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calnew.getTime()));
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(cal.getTime()));
        System.out.println("时间比较："+calnew.compareTo(cal));




    }
}