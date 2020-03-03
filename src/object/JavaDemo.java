package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Message <T>{
     private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        Message<String> msg=new Message<>();
        msg.setContent("Vigilr");
        fun(msg);
    }
    public static void fun(Message<?> temp){
//        temp.setContent(123);//通配符？可以使泛型对象不能修改，但可以访问
        System.out.println(temp.getContent());
    }

}
