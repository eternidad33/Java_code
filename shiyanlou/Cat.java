public class Cat implements Animal{
    public void eat(){
        System.out.println("Cat eats");
    }
    public void travel(){
        System.out.println("Cat travels");
    }
    public static void main(String []args){
        Cat cat=new Cat();
        cat.eat();
        cat.travel();
    }
}