# java_code

> 本项目主要用于记录本人从零基础开始学Java


## Java基础

从当前所在路径加载类`SET ClASSPATH=.

PATH：是操作系统提供的路径配置，定义所有可执行程序的路径  
CLASSPATH：是由JRE提供的，用于定义Java程序解释时类加载路径CLASSPATH=路径”的命令形式来进行定义；

---
Java 1.9之后才有的**Jshell**

**int的取值范围**为-2147483648到2147483647

```java
public static void main(String args[]) {
    final int max = Integer.MAX_VALUE;
    final int min = Integer.MIN_VALUE;
    System.out.println(max); // 2147483647
    System.out.println(min); // -2147483648
    System.out.println(max + 1); // -2147483648
    System.out.println(max + 2); // -2147483647
    System.out.println(min - 1); // 2147483647
}
```

大写字母范围：A(65)~Z(90)  
小写字母范围：a(97)~z(122)  
数值范围：'0'(48)~'9'(57)  

Java 获取变量类型
```java
public static void main(final String args[]) {
		boolean a = false;
		System.out.println(getType(a));
}
public static String getType(Object o) {
	return o.getClass().toString();
}
```
---
**this**关键字  
**this()**:调用无参的构造函数  
**this(name)**:调用参数为name的构造函数  


this(...)必须放在首行  


---
Static属性由类名直接调用  
static方法只允许调用static属性或static方法  
非static方法允许调用static属性或static方法

static的定义的方法或属性都不是你代码编写之初所需要考虑的内容，只有在回避实例化对象描述公共属性的情况下才会考虑static定义的属性或者是方法

静态代码块*最先执行*，而且只会执行一次，用于对静态属性的初始化，构造块会优于构造方法先执行

 
## Java进阶
### 数组
int数组初始化默认为0  
必须实例化数组才能使用数组下标  
foreach循环可以避免使用下标，
foreach遍历二维数组

返回数组的方法  

将数组封装成一个组件  

数组快速排序  

数组逆序

数组相关的类库  
数组排序可以这样写`java.util.Arrays.sort(data);`  
系统自带的数组拷贝

`System.arraycopy(dataA,5,dataB,5,3);`是将数组dataA中从索引为5，长度为3的一段数组复制到dataB中索引位置为5的地方，并替换掉相应长度
可变参数

在方法参数列表中`...`表示可变参数  
可变参数的作用在于，在以后进行一些程序设计或者开发者调用的时候，利用此种形式可以避免数组的传递操作
对象数组定义格式如下：
- 动态初始化：类 对象数组名称[]=new 类[长度]，每一个元素的内容都是null
- 静态初始化：类 对象数组名称[]=new 类[]{实例化对象，实例化对象，实例化对象...}

---
对象关联
```java
class Car {
    private String name;
    private double price;
    private Person per;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public static void main(String[] args) {
        Person per = new Person("张三", 15);
        Car car = new Car("BMW", 15000.00);
        car.setPer(per);
        car.getPer().tell();
    }
}
```

java源代码目录:C:\Program Files (x86)\Java\jdk-9\lib\src.zip

JDK 1.8及以前的String支持类

![java1.8](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.8String.png)

JDK 1.9的String支持类

![java1.9](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.9string.png)

JDK 1.8及以前String类保存的是字符数组

JDK 1.9及以后String类保存的是字节数组

String对象的比较

```java
public static void main(String[] args) {
        String A = "hellojava";
        String B = "hellojava";
        String C=new String("hellojava");
        System.out.println(A==B);//true
        System.out.println(A==C);//false
        System.out.println(A.equals(C));//true

    }
```
将所有小写字母转换成大写

```java
String str = new String("hellojava");
char result[] = str.toCharArray();//将字符串转化为字符数组
for(int x=0;x<result.length;x++)
    result[x]-=32;
System.out.println(new String(result));
```
判断是否全为数字
```java
public static void main(String[] args) {

    String str = new String("hellojava");
    System.out.println(isNumber(str) ? "该字符串全为数字" : "该字符串不全为数字");
}

private static boolean isNumber(String str) {
    char result[] = str.toCharArray();
    for (int i = 0; i < result.length; i++) {
        if (result[i] < '0' || result[i] > '9')
            return false;
    }
    return true;
}
```





















## Java高级进阶
