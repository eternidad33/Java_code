package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Color{
    public static final Color RED=new Color("红色");
    public static final Color GREEN=new Color("绿色");
    public static final Color BLUE=new Color("蓝色");
    private String title;
    private Color(String titile) {
        this.title=titile;
    }
    public static Color getInstance(String color){
        switch (color){
            case "red":return RED;
            case "green":return GREEN;
            case "blue":return BLUE;
            default:return null;
        }
    }
    @Override
    public String toString(){
        return this.title;
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        Color c=Color.getInstance("blue");
        System.out.println(c);
    }
}
