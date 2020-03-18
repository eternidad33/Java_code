package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vigilr
 * @project Java_code
 * @package regex
 * @time 2020/3/16 8:53
 */
public class RegexDemo {
    private static final String ZIP_REGEX = "(?<!\\d)" //左边不能有数字
            + "([0-9]{6})"  //邮编为6位数字
            + "(?![0-9])"; //右边不能有数字
    private static final String MOBILE_REGEX = "(?<!\\d)"//左边不能为数字
            + "((0086|\\+86)\\s?)?"//+86或者0086
            + "1[34578][0-9]-?[0-9]{4}-?[0-9]{4}"
            + "(?![0-9])";//右边不能为数字
    private static final String PHONE_REGEX = "(?<!\\d)"
            + "(\\(?0[0-9]{2,3}\\)?-?)?"//区号
            + "[0-9]{7,8}"//市内号码
            + "(?![0-9])";
    private static final String DATE_REGEX = "(?<![0-9])"
            + "\\d{4}-"//年
            + "(0?[1-9]|1[0-2])-"//月
            + "(0?[1-9]|[12][0-9]|3[01])"//日
            + "(?![0-9])";
    public static final String TIME_REGEX = "(?<![0-9])"
            + "([01][0-9]|2[0-3])"//小时
            + "(:[0-5][0-9])"//分钟
            + "(?![0-9])";
    public static final String IDCARD_REGEX = "(?<![0-9])"
            + "[1-9][0-9]{16}[1-9Xx]"
            + "(?![0-9])";
    public static final String IP_REGEX = "(?<![0-9])"
            + "((0{0,2}[0-9]|0?[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}"
            + "(0{0,2}[0-9]|0?[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])"
            + "(?![0-9])";
    public static final String URL_REGEX = "http://" + "[-0-9a-zA-Z.]+"//主机名
            + "(:\\d+)?"//端口
            + "("//可选的路径-开始
            +"/[-\\W$.+!*'(),%;:@&=]*"//第一层路径
            +"(/[-\\W$.+!*'(),%;:@&=]*)*"//其他路径
            +"(\\?/[-\\W$.+!*'(),%;:@&=]*)?"//查询
            + ")?";//可选的路径-结束
    private static Pattern ZIP_CODE_PATTERN = Pattern.compile(ZIP_REGEX);
    private static Pattern MOBILE_PATTERN = Pattern.compile(MOBILE_REGEX);
    private static Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    private static Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);
    private static Pattern TIME_PATTERN = Pattern.compile(TIME_REGEX);
    private static Pattern IDCARD_PATTERN = Pattern.compile(IDCARD_REGEX);
    private static Pattern IP_PATTERN = Pattern.compile(IP_REGEX);
    private static Pattern URL_PATTERN=Pattern.compile(URL_REGEX);


    public static void findZipCode(String str) {
        Matcher matcher = ZIP_CODE_PATTERN.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void findMOBILECode(String str) {
        Matcher matcher = MOBILE_PATTERN.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
    * 查找 
    * @param: [str]
    * @return: void
    */ 
    public static void findPhoneCode(String str) {
        Matcher matcher = PHONE_PATTERN.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void findDateCode(String str) {
        Matcher matcher = DATE_PATTERN.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void findTimeCode(String str) {
        Matcher matcher = TIME_PATTERN.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        findZipCode("邮编是053200，电话是13666668888");
        findMOBILECode("邮编是053200，电话是+86 13666668888.");
        findPhoneCode("电话号0318-82567894");
        findDateCode("日期是2020-3-16 09:56:07");
        findTimeCode("日期是2020-3-16 09:56:07");
//        Matcher matcher = IDCARD_PATTERN.matcher("str131122199515329874");
//        Matcher matcher = IP_PATTERN.matcher("255.255.255.1");
        Matcher matcher=URL_PATTERN.matcher("http://www.baidu.com");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
