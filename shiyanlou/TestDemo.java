class Test<T> {
    private T ob;

    /*
    定义泛型成员变量，定义完类型参数后，可以在定义位置之后的方法的任意地方使用类型参数，就像使用普通的类型一样。
    注意，父类定义的类型参数不能被子类继承。
    */

    //构造函数
    public Test(T ob) {
        this.ob = ob;
    }

    //getter 方法
    public T getOb() {
        return ob;
    }


    //setter 方法
    public void setOb(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }
}
public class TestDemo{
    public static void main(String[]args){
        Test<Integer> intob=new Test<Integer>(88);
        intob.showType();
        int i=intob.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");
        Test<String> strOb = new Test<String>("Hello Gen!");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= " + s);
    }
}