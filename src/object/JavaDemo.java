package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
enum Color {RED, BLUE, GREEN}

public class JavaDemo {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
