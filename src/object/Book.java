package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-26 11:32 am
 */
public class Book {
    private static int count=0;
    private String title;

    public Book(){
        System.out.println("NOTITLE-"+ ++count);
    }
    public Book(String title){
        this.title=title;
        count++;
        System.out.println("成功添加第"+count+"本书，书名："+this.title);
    }

    public static void main(String[] args) {
        Book b1=new Book("数据结构");
        Book b2=new Book("算法");
        Book b3=new Book("Java");
        Book b4=new Book();

    }
}
