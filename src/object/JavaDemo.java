package object;


/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Point <T>{
    private T x;
    private T y;
    public T getX(){
        return this.x;
    }
    public T getY(){
        return this.y;
    }
    public void setX(T x){
        this.x=x;
    }
    public  void setY(T y){
        this.y=y;
    }
}
public class JavaDemo {
    public static void main(String[] args) {
        Point<Integer> p1=new Point<>();
        p1.setX(12);//自动装箱
        p1.setY(21);
        System.out.println("P1点的坐标为（"+p1.getX()+","+p1.getY()+")");
    }

}
