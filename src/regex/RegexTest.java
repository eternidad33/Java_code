package regex;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vigilr
 * @project Java_code
 * @package regex
 * @time 2020/3/15 20:28
 */
public class RegexTest {
    private static Pattern templatePattern = Pattern.compile("\\{(\\w+)\\}");

    /**
     * @Description: 模板引擎
     * @Param: [template, params]
     * @return: java.lang.String
     */
    @NotNull
    public static String templateEngine(String template, Map<String, Object> params) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = templatePattern.matcher(template);
        while (matcher.find()) {
            String key = matcher.group(1);
            Object value = params.get(key);
            matcher.appendReplacement(stringBuffer, value != null ? Matcher.quoteReplacement(value.toString()) : "");
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void templateDemo() {
        String template = "我是{name},我的年龄{age}。";
        Map<String, Object> params = new HashMap<>();
        params.put("name", "vigilr");
        params.put("age", "23");
        System.out.println(templateEngine(template, params));
    }

    public static void main(String[] args) {
//        表示正则表达式
//        String regex="<\\w+>(.*)</\\1>";
//        String regex="\\d{6}";
//        Pattern pattern=Pattern.compile(regex);
//        System.out.println(pattern);
//        System.out.println(Pattern.quote(regex));

//        切分
//        String str="a,.b,.c,.d,.e,.f";
//        String[] result=str.split(",");
//        String[] result=str.split(",\\.");

//        String str="abc    def   ghi   jkl";
//        String[] result=str.split("[\\s.]+");

//        String str = ", abc, , def, , ";
//        String[] result = str.split(", ");
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result));

//        验证
//        String regex="\\d{8}";
//        String str="123456789";
//        System.out.println(str.matches(regex));

//        查找
//        find();
//        findGroup();

//        替换
//        String regex="\\s+";
//        String str="hello      world          !";
//        System.out.println(str);
//        System.out.println(str.replaceAll(regex," "));
//        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
//        Pattern pattern = Pattern.compile(regex);
//        String str = "今天：2020-03-15 昨天：2020-03-14";
//        System.out.println(str.replaceAll(regex,"$1/$2/$3"));
//        replaceFox();
        templateDemo();
    }

    /**
     * @Description: 查找
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/15
     */
    public static void find() {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        String str = "今天：2020-03-15 昨天：2020-03-14";
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println("发现：" + matcher.group() + "位置：" + matcher.start() + "-" + matcher.end());
        }
    }

    /**
     * @Description: 分组查找
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/15
     */
    public static void findGroup() {
        //分组正则
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        String str = "今天：2020-03-15 昨天：2020-03-14";
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(1) + "年" + matcher.group(2) + "月" + matcher.group(3) + "日");
        }
    }

    /**
     * @Description: 替换狐狸
     * @Param: []
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/15
     */
    public static void replaceFox() {
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher("one fox,two fox,three fox");
        StringBuffer stringBuffer = new StringBuffer();
        int findNum = 0;
        while (matcher.find()) {
//            将append位置到当前匹配之前的子字符串append到sb中，在第一次操作中，为"one "，第二次为", two "
            matcher.appendReplacement(stringBuffer, "dog");
            findNum++;
            if (findNum == 2) {
                break;
            }
        }
//        将替换字符串append到sb中
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}
