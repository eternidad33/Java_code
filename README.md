# java_code

> 本项目主要用于记录本人从零基础开始学Java


## Java基础

从当前所在路径加载类`SET ClASSPATH=.

PATH：是操作系统提供的路径配置，定义所有可执行程序的路径  
CLASSPATH：是由JRE提供的，用于定义Java程序解释时类加载路径CLASSPATH=路径”的命令形式来进行定义；

---
Java 1.9之后才有的**Jshell**

**int的取值范围**为-2147483648到2147483647



大写字母范围：A(65)~Z(90)  
小写字母范围：a(97)~z(122)  
数值范围：'0'(48)~'9'(57)  

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
### String
java源代码目录:C:\Program Files (x86)\Java\jdk-9\lib\src.zip

JDK 1.8及以前的String支持类

![java1.8](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.8String.png)

JDK 1.9的String支持类

![java1.9](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.9string.png)

JDK 1.8及以前String类保存的是字符数组

JDK 1.9及以后String类保存的是字节数组

---

#### String对象的比较
直接为字符串赋值会是字符串变量指向字符串池中的内存地址  
new String()会开辟新的内存  

#### 将所有小写字母转换成大写

先将字符串转换成字符数组，然后每个字符的编码-32

#### 判断是否全为数字
先将字符串转换成字符数组，`if (result[i] < '0' || result[i] > '9')`挨个判断每个字符


#### 字符串的比较
`str.equals(str1)`区分大小写比较  
`str.equalsIgnoreCase(str1)`不区分大小写比较  
`str.compareTo(str1)`字符串的大小的比较  
`str.compareToIgnoreCase(str1)`忽略大小写的字符串大小比较


#### 字符串的查找
`str.contains("hello")`判断字符串中是否含有hello  
`str.indexOf("Java")`查询Java是否存在于str中，存在返回首字母索引位置，不存在返回-1  
`str.lastIndexOf("Java")`从后向前查询  
`str2.endsWith("com")`判断是否以com结尾  
`str2.startsWith("www")`判断是否以www开头

#### 字符串的替换
`str.replaceAll("Java", "Python")`将全部的Java替换成Python  
`str.replaceFirst("Java", "Python")`将第一个Java替换成Python

#### 字符串的拆分
`str.split(" ")`以空格全部拆分，返回字符串数组  
`str.split(" ",2)`以空格拆分成2个，返回字符串数组  
`str1.split("\\.")`拆不开的情况要用"\\"进行转义


#### 字符串的截取
`str.substring(startIndex,endIndex)`截取str从startIndex到endIndex的字符串片段  


#### 字符串的格式化

format是一个静态方法,直接通过**String类调用**`String.format("姓名：%s，年龄：%d，分数：%5.2f",name,age,score`)


#### 其他字符串相关的方法
`str.concat(str2)`字符串的连接  
`str.isEmpty()`判断字符串内容是否为空  
`str.trim()`去掉字符串中所有空格  
`str.toUpperCase()`全部转换成大写  
`(str.toLowerCase()`全部转换成小写  


### 继承
`public class object.Student extends object.Person`Student类继承Person所有共有的属性和方法 

子类被实例化时先调用父类的构造方法

super(...)必须放在首行，this(...)也必须放在首行，所以两者不可同时出现

多层继承

理论上层数最多不能超过三层

- 父类的私有方法不存在覆写
- 子类调用有父类覆写的方法要加super

|Overloading|Override|
|:-----:|:----:|
|重载|覆写|
|方法名称相同，参数的类型及个数不同|方法名称，参数类型及个数，返回值相同|
|没有权限限制|被覆写方法不能拥有更严格的控制权限|
|发生在一个类中|发生在继承关系类中|

> 在程序类中使用this表示先从本类查找所需要的的属性或方法，如果本类中不存在则查找父类定义，如果使用super则不查找子类，直接查找父类

fanal代表不能被覆写的方法，常量

### Annotation注解

@Override 准确覆写  
@Deprecated 代表过时的类或方法  
@SuppressWarnings 压制警告  

### 多态
向上转型`base f = new son()`可以调用父类的方法和子类中重写父类的方法

向下转型`son1 s=(son)f`不安全

instanceof 

instanceof为了保证向下转型的正确性，用于在转型之前进行判断，判断某个实例是否是某个类的对象



### Object类

Object类是所有类型的父类，所以Object类可以接收所有子类的对象

`toString()`是Object自带的方法，所有继承类都可以使用


1. 对象比较equals()
2. 判断对象是否为null
3. 判断是不是同一地址
4. 判断obj是否转换为person
5. 判断内容是否相同

### 抽象类

抽象方法所在的类必须为抽象类，抽象类必须用`abstract`关键字来定义

抽象类就是在普通类上追加了抽象方法

抽象类是无法被实例化的

1. 抽象类必须提供子类
2. 抽象类的子类（非抽象类）一定要覆写抽象类中的全部抽象方法
3. 抽象类的对象实例化可以通过子类向上转型的方式完成



> 抽象类自己无法直接实例化

`final`不允许有子类，`abstract`必须有子类

> 抽象类中可以使用普通方法调用抽象方法

### 包装类
`Int temp = new Int(10);`装箱，将基本数据类型保存在包装类中

`int x = temp.intValue();`拆箱，从包装类中获取基本数据类型

1. 对象型的包装类，Boolen,Character
2. 数值型的包装类,Byte,Short,Integer,Long,Float,Double

基本的装箱与拆箱操作


jdk1.5之后可以实现自动装箱与拆箱操作，包装类可以直接参与数学运算

### 接口

接口的组成以抽象方法和全局常量为主，使用关键字`interface`定义，接口的名称通常首字母加上`I`

1. 接口需要被子类实现，关键字`implements`，一个子类可以实现多个接口
2. 子类（非抽象类）必须覆写接口中的全部抽象方法
3. 接口对象可以通过子类对象的向上转型实例化

接口的主要目的是一个子类可以实现多个接口

接口不允许继承父类
> Object类对象可以接收所有的数据类型，包括基本数据类型，类对象，接口对象，数组
>方法不写访问权限也是`public`，不是`default`

接口可以通过`extends`集成多个父接口

接口的使用：
1. 进行标准设置
2. 表示一种操作的能力
3. 暴露远程方法视图

JDK1.8之前，在进行设计时，一般子类不直接继承接口，中间加一个过渡抽象类

接口的方法加上`public default`代表普通方法

USB接口设计

### 工厂设计模式

### 代理设计模式

一个借口提供两个子类，其中一个是真实业务操作类，另一个是代理业务操作类

### 接口与抽象类的比较
|接口|抽象类|
|:---:|:---:|
|interface 接口名称{}|abstract class 抽象类名称{}|
|抽象方法，全局常量，普通方法，静态方法|构造，普通方法，静态方法，全局变量，成员|
|只有public权限|可以使用各类权限|
|子类通过`implements`关键字可以继承多个接口|子类通过`extends`关键字继承一个抽象类|
|接口不允许结成抽象类，可以继承多个父接口|抽象类可以实现若干个接口|

使用时的共同点
1. 抽象类或接口必须定义子类
2. 子类必须覆写抽象类或接口的全部抽象方法
3. 通过子类的向上转型实现抽象类或接口的对象实例化

### 泛型
基本数据类型→包装类型→`Object`类

向上转型成`Object`类，容易出现`ClassCastException`异常

> 1. 泛型之中只允许设置引用类型，如果要操作基本类型必须使用包装类
> 2. 泛型对象实例化对象可以简化为`Point<Integer> p1=new Point<>();`

通配符`<?>`可以使泛型对象在方法中不被改变

`<T extends 类>`:设置泛型的上限
`<T super 类>`:设置泛型的下限
### 泛型接口

子类实现泛型接口两种方式：
1. 在子类之中继续设置泛型定义

2. 子类实现父接口是直接定义泛型类型

### 泛型方法
泛型方法不一定出现在泛型类之中

工厂模式中使用泛型方法

### 包

同一个目录下不能有同名的程序文件，要创建不同的目录，不同的的目录就是不同的包

`javac -d . hello.java`  
`-d`:表示要生成目录，目录为`package`定义的结构  
`.`:表示从当前目录开始生成

类的名称：包.类名称

`import util.Message;`导入其他包的类

当导入的几个包中出现重名的类时，定义类要用完整的类名称`Message msg=new util.Message();`。

#### 静态导入
`import static util.Math.*;`静态导入后可以直接使用`util.Math`中的方法

### Jar
想用`javac`编译，然后用`jar`打包

`jar -cvf "名称.jar" 文件夹`   
`-c`创建一个新的`jar`文件  
`-v`得到一个详细输出  
`-f`设置生成的`Jar`文件名称

### 系统常见包
`java.lang`包括String，Number，Object等  
`java.lang.reflect`反射机制处理包  
`java.util`工具类的定义，包括数据结构的定义  
`java.io`进行输入与输出流操作的包  
`java.net`网络程序开发的程序包  
`java.sql`进行数据库编程的开发包  
`java.awt`和`java.swing`Java的图形界面开发包，awt是重量级的组件，swing是轻量级的组件

### 访问控制权限
面向对象的三个主要特点：封装，继承，多态

|     访问范围     | private | default | protected | public |
| :--------------: | :-----: | :-----: | :-------: | :----: |
| 同一包中的同一类 |    √    |    √    |     √     |   √    |
| 同一包中的不同类 |         |    √    |     √     |   √    |
|   不同包的子类   |         |         |     √     |   √    |
|  不同包的所有类  |         |         |           |   √    |

### UML
UML是统一的建模语言，本质是利用图形化的形式来实现程序类关系的描述

#### 类图
类一般用三层结构来显示

|**类名称**|
|:---:|
|属性|
|方法|

抽象类一般用斜体表示，也可以加上`abstract`  
属性的格式为`访问权限 属性名称：属性类型`  
访问权限的表示符为public(`+`),private(`-`),protected(`#`)  
方法的格式为`访问权限 方法名称():返回值"结构


子类实现接口用"三角和虚线",类的继承用"三角和实线",由子类指向父类

#### 时序图
时序图用于描述代码的执行流程

#### 用例图
用例图用于描述程序的执行分配

#### 单例设计

懒汉式

​	在第一次使用时进行实例化处理

饿汉式

​	在系统加载类时，实例化对象

#### 多例设计

单例设计是指只保留一个实例化对象，多例设计是指保留多个实例化对象

```java
class Color{
    public static final Color RED=new Color("红色");
    public static final Color GREEN=new Color("绿色");
    public static final Color BLUE=new Color("蓝色");
    private String title;
    public Color(String titile) {
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
        Color c=Color.getInstance("green");
        System.out.println(c);
    }
}
```

单例设计和多例设计的本质是相同的，一定都会在内部提供有`static`方法以返回实例化对象

---
## Java高级进阶
