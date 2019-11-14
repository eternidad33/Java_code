class Animal{
    public int legnum;//动物四肢数量
    public void bark(){
        System.out.println("动物叫！");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("汪汪汪");
    }
    public void typeDog(){
        System.out.println("这是什么品种的狗？");
    }
}
public class Test{

    public static void main(String[] args) {
        Animal a=new Animal();
        Dog d=new Dog();
        Animal b= new Dog();
        a.bark();
        d.bark();
        b.bark();
        d.typeDog();
    }
}