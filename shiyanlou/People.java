public class People{
    private double height;//身高
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        height=newHeight;
    }
    int age;//年龄
    int sex;//性别，0为男性，1为女性
    public People(){}
    public People(int a){}
    public People(double h,int a,int s){
        height=h;
        age=a;
        sex=s;
    }
    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");
    }
}