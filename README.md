[Toc]
# java_code

> 此仓库主要用于记录本人学习Java的过程，按照阿里云上的Java学习路线自学的，代码的解释可以访问我的简书个人主页，

<p align="right">
      <a href="https://docs.oracle.com/javase/8/docs/api/index.html"><img src="https://img.shields.io/badge/java-doc-yellow?logo=Java" alt="Java官方文档"></a> 
      <a href="https://edu.aliyun.com/roadmap/java?spm=5176.11400045.0.0.18f33a89excX5p"><img src="https://img.shields.io/badge/Java-%E5%AD%A6%E4%B9%A0%E8%B7%AF%E7%BA%BF-orange" alt="Java学习路线"></a> 
      <a href="https://www.jianshu.com/u/651a6ee53f49"><img src="https://img.shields.io/badge/blogs-%E7%AE%80%E4%B9%A6-orange" alt="简书"></a> 
</p>

推荐书籍：
- [《Java编程的逻辑》](https://weread.qq.com/web/reader/b51320f05e159eb51b29226kc81322c012c81e728d9d180)
- [《疯狂Java讲义精粹》](https://weread.qq.com/web/reader/b9f325405a64efb9fa69ebfkc81322c012c81e728d9d180)

## Java基础

从当前所在路径加载类`SET ClASSPATH=.`

PATH：是操作系统提供的路径配置，定义所有可执行程序的路径

CLASSPATH：是由JRE提供的，用于定义Java程序解释时类加载路径`CLASSPATH=路径`的命令形式来进行定义；

---
Java 1.9之后才有的`Jshell`

`int`的取值范围为-2147483648到2147483647

大写字母范围：A(65)\~Z(90)

小写字母范围：a(97)\~z(122)

数值范围：'0'(48)\~'9'(57)

---
**this**关键字

**this()**:调用无参的构造函数

**this(name)**:调用参数为name的构造函数

**this(...)**必须放在首行  

---
Static属性由类名直接调用

static方法只允许调用static属性或static方法

非static方法允许调用static属性或static方法

static的定义的方法或属性都不是代码编写之初所需要考虑的内容，只有在回避实例化对象描述公共属性的情况下才会考虑static定义的属性或者是方法

静态代码块*最先执行*，而且只会执行一次，用于对静态属性的初始化，构造块会优于构造方法先执行


## Java进阶 
### 数组
`int`数组初始化默认为0

必须实例化数组才能使用数组下标

`foreach`循环可以避免使用下标，

`foreach`遍历二维数组

返回数组的方法  

将数组封装成一个组件  

数组快速排序  

数组逆序

数组相关的类库

数组排序可以这样写`java.util.Arrays.sort(data);`

系统自带的数组拷贝`System.arraycopy(dataA,5,dataB,5,3);`是将数组`dataA`中从索引为5，长度为3的一段数组复制到`dataB`中索引位置为5的地方，并替换掉相应长度

可变参数

在方法参数列表中`...`表示可变参数

可变参数的作用在于，在以后进行一些程序设计或者开发者调用的时候，利用此种形式可以避免数组的传递操作

对象数组定义格式如下：

- 动态初始化：类 对象数组名称[]=new 类[长度]，每一个元素的内容都是null
- 静态初始化：类 对象数组名称[]=new 类[]{实例化对象，实例化对象，实例化对象...}

---
### String
java源代码目录:`C:\Program Files (x86)\Java\jdk-9\lib\src.zip`

JDK 1.8及以前的String支持类

![java1.8](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.8String.png)

JDK 1.9的String支持类

![java1.9](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/java1.9string.png)

JDK 1.8及以前String类保存的是字符数组

JDK 1.9及以后String类保存的是字节数组

***String对象的比较***

直接为字符串赋值会是字符串变量指向字符串池中的内存地址

`new String()`会开辟新的内存  

将所有小写字母转换成大写

先将字符串转换成字符数组，然后每个字符的编码-32

**判断是否全为数字**

先将字符串转换成字符数组，`if (result[i] < '0' || result[i] > '9')`

然后挨个判断每个字符

**字符串的比较**

`str.equals(str1)`区分大小写比较

`str.equalsIgnoreCase(str1)`不区分大小写比较

`str.compareTo(str1)`字符串的大小的比较

`str.compareToIgnoreCase(str1)`忽略大小写的字符串大小比较

**字符串的查找**

`str.contains("hello")`判断字符串中是否含有hello

`str.indexOf("Java")`查询Java是否存在于str中，存在返回首字母索引位置，不存在返回-1

`str.lastIndexOf("Java")`从后向前查询

`str2.endsWith("com")`判断是否以com结尾

`str2.startsWith("www")`判断是否以www开头

**字符串的替换**

`str.replaceAll("Java", "Python")`将全部的Java替换成Python

`str.replaceFirst("Java", "Python")`将第一个Java替换成Python

**字符串的拆分**

`str.split(" ")`以空格全部拆分，返回字符串数组

`str.split(" ",2)`以空格拆分成2个，返回字符串数组

`str1.split("\\.")`拆不开的情况要用"\\"进行转义

**字符串的截取**

`str.substring(startIndex,endIndex)`截取`str`从`startIndex`到`endIndex`的字符串片段  

**字符串的格式化**

format是一个静态方法,直接通过**String类调用**`String.format("姓名：%s，年龄：%d，分数：%5.2f",name,age,score`)

**其他字符串相关的方法**

`str.concat(str2)`字符串的连接

`str.isEmpty()`判断字符串内容是否为空

`str.trim()`去掉字符串中所有空格

`str.toUpperCase()`全部转换成大写

`(str.toLowerCase()`全部转换成小写  

---

### 继承

`public class object.Student extends object.Person`Student类继承Person所有共有的属性和方法 

子类被实例化时先调用父类的构造方法

`super(...)`必须放在首行，`this(...)`也必须放在首行，所以两者不可同时出现

**多层继承**

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

---

### Annotation注解

`@Override `准确覆写

`@Deprecated` 代表过时的类或方法

`@SuppressWarnings` 压制警告  

---

### 多态
向上转型`base f = new son()`可以调用父类的方法和子类中重写父类的方法

向下转型`son1 s=(son)f`不安全

`instanceof `

`instanceof`为了保证向下转型的正确性，用于在转型之前进行判断，判断某个实例是否是某个类的对象

---

### Object类

Object类是所有类型的父类，所以Object类可以接收所有子类的对象

`toString()`是Object自带的方法，所有继承类都可以使用


1. 对象比较equals()
2. 判断对象是否为null
3. 判断是不是同一地址
4. 判断obj是否转换为person
5. 判断内容是否相同

---

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

---

### 包装类

`Int temp = new Int(10);`装箱，将基本数据类型保存在包装类中

`int x = temp.intValue();`拆箱，从包装类中获取基本数据类型

1. 对象型的包装类，`Boolen,Character`
2. 数值型的包装类,`Byte,Short,Integer,Long,Float,Double`

基本的装箱与拆箱操作

jdk1.5之后可以实现自动装箱与拆箱操作，包装类可以直接参与数学运算

---

### 接口

接口的组成以抽象方法和全局常量为主，使用关键字`interface`定义，接口的名称通常首字母加上`I`

1. 接口需要被子类实现，关键字`implements`，一个子类可以实现多个接口
2. 子类（非抽象类）必须覆写接口中的全部抽象方法
3. 接口对象可以通过子类对象的向上转型实例化

接口的主要目的是一个子类可以实现多个接口

接口不允许继承父类
> Object类对象可以接收所有的数据类型，包括基本数据类型，类对象，接口对象，数组…
>
> 方法不写访问权限也是`public`，不是`default`

接口可以通过`extends`集成多个父接口

接口的使用：
1. 进行标准设置
2. 表示一种操作的能力
3. 暴露远程方法视图

JDK1.8之前，在进行设计时，一般子类不直接继承接口，中间加一个过渡抽象类

接口的方法加上`public default`代表普通方法

USB接口设计

---

### 工厂设计模式

**代理设计模式**

一个接口提供两个子类，其中一个是真实业务操作类，另一个是代理业务操作类

**接口与抽象类的比较**

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

---

### 泛型
基本数据类型→包装类型→`Object`类

向上转型成`Object`类，容易出现`ClassCastException`异常

> 1. 泛型之中只允许设置引用类型，如果要操作基本类型必须使用包装类
> 2. 泛型对象实例化对象可以简化为`Point<Integer> p1=new Point<>();`

通配符`<?>`可以使泛型对象在方法中不被改变

`<T extends 类>`:设置泛型的上限

`<T super 类>`:设置泛型的下限

**泛型接口**

子类实现泛型接口两种方式：
1. 在子类之中继续设置泛型定义

2. 子类实现父接口是直接定义泛型类型

**泛型方法**

泛型方法不一定出现在泛型类之中

工厂模式中使用泛型方法

---

### 包

同一个目录下不能有同名的程序文件，要创建不同的目录，不同的的目录就是不同的包

`javac -d . hello.java`

`-d`:表示要生成目录，目录为`package`定义的结构

`.`:表示从当前目录开始生成

类的名称：`包.类名称`

`import util.Message;`导入其他包的类

当导入的几个包中出现重名的类时，定义类要用完整的类名称`Message msg=new util.Message();`。

**静态导入**

`import static util.Math.*;`静态导入后可以直接使用`util.Math`中的方法

**Jar**

想用`javac`编译，然后用`jar`打包

`jar -cvf "名称.jar" 文件夹` 

`-c`创建一个新的`jar`文件

`-v`得到一个详细输出

`-f`设置生成的`Jar`文件名称

**系统常见包**

`java.lang`包括String，Number，Object等

`java.lang.reflect`反射机制处理包

`java.util`工具类的定义，包括数据结构的定义

`java.io`进行输入与输出流操作的包

`java.net`网络程序开发的程序包

`java.sql`进行数据库编程的开发包

`java.awt`和`java.swing`Java的图形界面开发包，awt是重量级的组件，swing是轻量级的组件

**访问控制权限**

面向对象的三个主要特点：封装，继承，多态

|     访问范围     | private | default | protected | public |
| :--------------: | :-----: | :-----: | :-------: | :----: |
| 同一包中的同一类 |    √    |    √    |     √     |   √    |
| 同一包中的不同类 |         |    √    |     √     |   √    |
|   不同包的子类   |         |         |     √     |   √    |
|  不同包的所有类  |         |         |           |   √    |

---

### UML

UML是统一的建模语言，本质是利用图形化的形式来实现程序类关系的描述

**类图**

类一般用三层结构来显示

|**类名称**|
|:---:|
|属性|
|方法|

抽象类一般用斜体表示，也可以加上`abstract`

属性的格式为`访问权限 属性名称：属性类型`

访问权限的表示符为public(`+`),private(`-`),protected(`#`)

方法的格式为`访问权限 方法名称():返回值`结构


子类实现接口用"三角和虚线",类的继承用"三角和实线",由子类指向父类

**时序图**

时序图用于描述代码的执行流程

**用例图**

用例图用于描述程序的执行分配

---

### 单例设计

**懒汉式**

​	在第一次使用时进行实例化处理

**饿汉式**

​	在系统加载类时，实例化对象

**多例设计**

单例设计是指只保留一个实例化对象，多例设计是指保留多个实例化对象
单例设计和多例设计的本质是相同的，一定都会在内部提供有`static`方法以返回实例化对象。都要进行构造方法私有化

---

### 枚举

枚举主要作用于定义有限个数对象的一种结构（多例设计），通过`enum`定义枚举类

遍历枚举

`c.ordinal()`:c在枚举类中的序号

`c.name()`:c的值

- `enum`:是从JDK1.5之后提供的一个关键字，用来定义枚举类
- `Enum`：是一个抽象类，所有使用`enum`关键字定义的类，默认继承此类

构造枚举类

枚举类实现接口

---

### 异常

处理异常的三种组合：`try...catch`，`try...catch...finally`，`try...finally`

通过`e.printStackTrace();`获取完整的异常信息

**异常处理流程**

1. 产生异常，自动产生异常的实例化对象
2. 如果不处理异常，JVM默认打印异常信息，然后退出程序
3. 如果存在异常处理，异常实例化对象将会被`try`语句捕获
4. `catch`匹配异常
5. 执行`finally`



处理异常最大的类型是`Throwable`，有两个子类

1. `Error`:此时程序还未执行出现的错误，开发者无法处理
2. `Exception`:程序中出现的异常

在多个异常处理的时候要将捕获范围大的异常放在捕获范围小的异常后面

通过`throws`抛出异常

`throw`手动抛出异常

`throw`和`throws`的区别

- `throw`是在代码块中使用的，主要是手工对异常对象的抛出
- `throws`是在方法定义上使用的，表示将此方法中可能产生的异常明确告诉给调用处，由调用处进行处理

`RuntimeException`是`Exception`的子类

常见的`RuntimeException`： `NullPointerException`，`ClassCastException`，`IndexOutOfBoundsException`

**自定义异常类**

---

### 内部类

内部类的优点是可以轻松地访问外部类的私有属性，缺陷是破坏了类的结构

内部类和外部类之间的操作不需要`setter`和`getter`，内部类实例化对象的格式`外部类.内部类 内部类对象=new 外部类().new 内部类; `

如果`Inner`类加上`private`属性，则`Inner`无法在外部进行使用

**在接口中定义内部抽象类**

**灵活的内部类**

**静态内部类**

`static`的类和方法只能访问外部类的`static`的属性或方法.

`static`定义的内部类并不常用，`static`定义内部接口更常用

**在方法中定义内部类**

方法中的内部类既能访问方法中的参数，又能访问外部类的私有成员属性。对于方法中参数的访问是从JDK1.8开始支持的。

**匿名内部类的使用**

> 往往使用静态方法做一个内部的匿名内部类

匿名内部类只是一个没有名字的只能够使用一次的，并且结构固定的一个子类

---

### 函数式编程

从JDK1.8开始提供有`Lambda`表达式的支持


`Lambda`表达式使用时有一个重要的实现要求就是SAM(Single Abstract Method)只有一个抽象方法,该接口被称为函数式接口

Lambda表达式的三种格式：

1. 没有参数：`()->{};`
2. 有参数：`(参数,参数)->{};`
3. 只有一条返回语句`(参数,参数)->语句;`


对方法的引用

1. 引用静态方法：`类名称::static 方法名称;`

   `IFunction<String, Integer> fun = String::valueOf;`

2. 引用某个实例对象的方法：`实例化对象::普通方法;`

   `IFunction fun="hellojava"::toUpperCase;`

3. 引用特定类型的方法：`特定类::普通方法;`

   `IFunction<String> fun=String::compareTo;`

4. 引用构造方法：`类名称::new`

   `IFunction<Person> fun=Person::new;`

在`java.util.funtion`包中可以直接使用函数式接口

1. 功能性函数式接口

   ```java
   Function<String,Boolean> fun="hellojava"::startsWith;
   System.out.println(fun.apply("hello"));
   ```

2. 消费型函数式接口:只能进行数据的处理，没有任何的返回

   ```java
   Consumer<String> fun=System.out::println;
   fun.accept("HelloJava");
   ```
   
3. 供给型函数式接口

   ```java
   Supplier<String> fun="hellojava"::toUpperCase;
   System.out.println(fun.get());
   ```

4. 断言型函数式接口

   ```java
   Predicate<String> fun="hello"::equals;
   System.out.println(fun.test("hello"));
   ```

---

### 链表

由于数组的长度是固定的，所以要引入链表

**链表节点的基本结构**

**直接操作节点**

**链表节点的增加**

1. 判断增加的节点是否为空
2. 判断根节点是否为空
3. 添加节点

Link类只负责数据的操作与根节点的处理而所有后续节点的处理全部都是有Node类负责。

**获取链表元素的个数**

1. 在`ILink`接口中增加`size()`方法

2. 在`LinkImpl`中重写`size()`方法

3. 在`LinkImpl`中增加私有属性`count`,然后在`add(E e)`加上`this.count++;`语句


**判断链表是否为空**

既可以判断根节点是否为空，也可以判断长度是否为0

**返回链表数据**

1. 在`ILink`接口中追加`public Object[] toArray();`方法

2. 在`LinkImpl`中加上两个属性

3. 在`Node`中递归获取数据

4. 在`LinkImpl`中重写`public Object[] toArray();`方法


链表数据的返回是以数组的形式返回

**根据索引获取数据**

1. `ILink`加上`public E get(int index);`
2. 在`Node`中定义`public E getNode(int index)`

3. 在`LinkImpl`中重写`public E get(int index)`

**修改指定索引的数据**

1. 在`ILink`加上`public void set(int index,E value);`
2. 在`Node`中定义`public void setNode(int index,E value)`
3. 在`LinkImpl`中重写`public void set(int index, E value)`

**判断指定数据是否存在**

1.  在`ILink`加上`public boolean contains(E data)`
2. 在`Node`中定义`public boolean containsNode(E data)`
3. 在`LinkImpl`中重写`public boolean contains(E data)`

**数据删除**

1. 在`ILink`中加上`public void remove(E data)`
2. 在`LinkImpl`中判断要删除的元素是否为根节点
3. 如果不是根节点，在`Node`中定义删除节点
4. 在`LinkImpl`中完善`public void remove(E data)`方法

**数据清除**

1. 在`ILink`中追加`public void clean();`方法
2. 在`LinkImpl`中重写`public void clean()`

---

### AWT

> - AWT界面组件：包括窗口、对话框、基本组件、菜单组件。
> - AWT布局管理器：包括流式布局FlowLayout、区域布局BorderLayout、网格布局GridLayout、卡片布局CardLayout。
> - AWT事件处理：事件授权模型、事件类型，监听器和适配器的使用。

AWT的组件包括两大类：Component和MenuComponent，即组件与菜单栏

类java.awt.Component是许多组件类的父类，Component类中封装了组件通用的方法和属性，如图形的组件对象、大小、显示位置、前景色和背景色、边界、可见性等。

一般我们要生成一个窗口，通常是用Window的子类Frame来进行实例化，而不是直接用到Window类

**`Panel`是一个容器，放在Frame组件内，可以用于包装一组组件。**

> idea中中文乱码设置`VM option: -Dfile.encoding=GB18030 `

**对话框`Dialog`**


**创建文本对话框`FileDialog`**


***基本组件***

1. 文本`Label`
2. 按钮`Button`
3. 复选框`Checkbox`
4. 复选框组`CheckboxGroup`
5. 下拉列表`Choice`
6. 文本框`TextField`
7. 文本区域`TextArea`
8. 列表`List`
9. 画布`CAnvas`

***菜单组件***

1. 菜单栏`MenuBar`
2. 菜单`Menu`
3. 菜单选项`MenuItem`

***AWT布局管理器***

> Frame是一个顶级窗口。Frame的默认布局管理器为`BorderLayout`。
>
> Panel无法单独显示，必须添加到某个容器中。Panel的默认布局管理器为FlowLayout。
>
> 当把Panel作为一个组件添加到某个容器中后，该Panel仍然可以有自己的布局管理器。因此，可以利用Panel使得`BorderLayout`中某个区域显示多个组件，达到设计复杂用户界面的目的。
>
> 如果采用无布局管理器`setLayout(null)`，则必须使用`setLocation()`、`setSize()`、`setBounds()`等方法手工设置组件的大小和位置，此方法会导致平台相关，不鼓励使用。

**流式布局FlowLayout**

FlowLayout是Panel、Applet的默认布局管理器。其组件的放置规律是从上到下、从左到右进行放置，如果容器足够宽，第一个组件先添加到容器中第一行的最左边，后续的组件依次添加到上一个组件的右边，如果当前行已放置不下该组件，则放置到下一行的最左边。

`FlowLayout(FlowLayout.RIGHT,20,40);`：第一个参数表示组件的对齐方式，指组件在这一行中的位置是居中对齐、居右对齐还是居左对齐，第二个参数是组件之间的横向间隔，第三个参数是组件之间的纵向间隔，单位是像素。

**区域布局BorderLayout**

BorderLayout是Window、Frame和Dialog的默认布局管理器。BorderLayout布局管理器把容器分成5个区域：North、South、East、West和Center，每个区域只能放置一个组件。

> 不一定所有的区域都有组件，如果四周的区域（West、East、North、South区域）没有组件，则由Center区域去补充，但是如果Center区域没有组件，则保持空白

**网格布局GridLayout**

GridLayout使容器中各个组件呈网格状布局，平均占据容器的空间，创建该布局时需要指定网格的行数和列数，然后依次添加各个组件时，会按照先行后列的顺序依次添加。

**卡片布局CardLayout**

CardLayout卡片布局管理器能够帮助用户处理两个以至更多的成员共享同一显示空间，它把容器分成许多层，每层的显示空间占据整个容器的大小，但是每层只允许放置一个组件，当然每层都可以利用Panel来实现复杂的用户界面。

***AWT事件处理***

使用授权处理模型进行事件处理的一般方法归纳如下。

- 对于某种类型的事件XXXEvent，要想接收并处理这类事件，必须定义相应的事件监听器类，该类需要实现与该事件相对应的接口XXXListener。

- 事件源实例化以后，必须进行授权，注册该类事件的监听器，使用addXXXListener(XXXListener )方法来注册监听器。

AWT事件共有10类，可以归为两大类：低级事件和高级事件。

低级事件是指基于组件和容器的事件，当一个组件上发生事件，如：鼠标的进入、单击、拖放等，或组件的窗口开关等，触发了组件事件。

高级事件是基于语义的事件，它可以不和特定的动作相关联，而依赖于触发此事件的类，如在TextField中按Enter键会触发ActionEvent事件，滑动滚动条会触发AdjustmentEvent事件，或是选中项目列表的某一条就会触发ItemEvent事件。

**事件监听器**

每类事件都有对应的事件监听器，监听器是接口，根据动作来定义方法

 使用事件监听器：实现监听器接口、使用内部类和匿名类。

使用事件适配器。

***AWT多媒体编程***

**多媒体处理**

- 图像处理——java.awt.image
- 二维图像绘制——Java2D。
- 音频录制与播放——JavaSound。
- 视频拍照与播放——JMF。

---

### 正则表达式

**基本语法**

1. 八进制表示的字符，以`\0`开头，后跟1～3位数字
2. 十六进制表示的字符，以`\x`开头，后跟两位字符
3. Unicode编号表示的字符，以`\u`开头，后跟4位字符
4. 点号字符`.`是一个元字符，默认模式下，它匹配除了换行符以外的任意字符
5. 以`(? s)`开头，s表示single line，即单行匹配模式
6. 为方便表示连续的多个字符，字符组中可以使用连字符'-'
7. 字符组支持排除的概念，在`[`后紧跟一个字符`^`,只有在字符组的开头才是元字符，如果不在开头，就是普通字符，匹配它自身
8. `\d`:d表示digit，匹配一个数字字符
9. `\w`:w表示word，匹配一个单词字符
10. `\s`:s表示space，匹配一个空白字符
11. `\D`：匹配一个非数字字符
12. `\W`：匹配一个非单词字符
13.  `\S`：匹配一个非空白字符

**量词**指的是指定出现次数的元字符：

1. `+`：表示前面字符的一次或多次出现
2. `\*`：表示前面字符的零次或多次出现
3. `?` ：表示前面字符可能出现，也可能不出现
4. 更为通用的表示出现次数的语法是`{m, n}`，出现次数从m到n，包括m和n，如果n没有限制，可以省略，如果m和n一样，可以写为`{m}`
5. 使用懒惰量词，在量词的后面加一个符号`?` 
6. 表达式可以用括号`()`括起来，表示一个分组

**特殊边界匹配**

1. 默认情况下，`^`匹配整个字符串的开始
2. 默认情况下，`$`匹配整个字符串的结束
3. `\A`与`^`类似，但不管什么模式，它匹配的总是整个字符串的开始边界。
4. `\Z`和`\z`与`$`类似，但不管什么模式，它们匹配的总是整个字符串的结束边界。
5. `\b`匹配的是单词边界

**环视边界匹配**

环视的字面意思就是左右看看，需要左右符合一些条件，本质上，它也是匹配边界，对边界有一些要求，这个要求是针对左边或右边的字符串的。

1. **肯定顺序环视**，语法是`(? =...)`，要求右边的字符串匹配指定的表达式。
2. **否定顺序环视**，语法是`(? ! ...)`，要求右边的字符串不能匹配指定的表达式。
3. **肯定逆序环视**，语法是`(? <=...)`，要求左边的字符串匹配指定的表达式。
4. **否定逆序环视**，语法是`(? <! ...)`，要求左边的字符串不能匹配指定的表达式。

这些环视结构也被称为断言，断言的对象是边界，边界不占用字符，没有宽度，所以也被称为零宽度断言。

**Java API**

正则表达式相关的类位于包java.util.regex下，有两个主要的类，一个是Pattern，另一个是Matcher

1. 表示正则表达式

   在Java中，没有什么特殊的语法能直接表示正则表达式，需要用字符串表示，而在字符串中，'\'也是一个元字符，为了在字符串中表示正则表达式的'\'，就需要使用两个'\'，即'\\'，而要匹配'\'本身，就需要4个'\'，即'\\\\'

   三种匹配模式：单行模式（点号模式）、多行模式和大小写无关模式，它们对应的常量分别为：Pattern.DOTALL、Pattern.MULTILINE和Pattern.CASE_INSENSI-TIVE，多个模式可以一起使用，通过'|'连起来即可

2. 切分

3. 验证

4. 查找

5. 替换

---
## Java高级进阶

### List集合

集合操作最常用的两种方法：`add()`，`iterator()`

`public interface List<E> extends Collection<E>`

Collection的继承关系，如图：

![Collection继承关系](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/Collection.png)

List的三个常用子类：

1. `ArrayList`
2. `LinkedList `
3. `Vector`

**ArrayList**

继承关系

```java
public class ArrayList<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable
```

**LinkedList**

继承关系

```java
public class LinkedList<E>
extends AbstractSequentialList<E>
implements List<E>, Deque<E>, Cloneable, Serializable
```



**Vector**

Vector是一个古老的集合（从JDK 1.0就有了）

继承关系

```java
public class Vector<E>
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, Serializable
```
---
### Set集合

Set集合不允许包含相同的元素，如果试图把两个相同的元素加入同一个Set集合中，则添加操作失败，add方法返回false，且新元素不会被加入。

Set判断两个对象相同不是使用==运算符，而是根据equals方法

**HashSet**


HashSet按Hash算法来存储集合中的元素，因此具有很好的存取和查找性能。

HashSet不是同步的，如果多个线程同时访问一个HashSet，假设有两个或者两个以上线程同时修改了HashSet集合时，则必须通过代码来保证其同步。

**LinkedHashSet**

HashSet还有一个子类LinkedHashSet，LinkedHashSet集合也是根据元素的hashCode值来决定元素的存储位置，但它同时使用链表维护元素的次序，这样使得元素看起来是以插入的顺序保存的。

**TreeSet**

TreeSet是SortedSet接口的实现类，正如SortedSet名字所暗示的，TreeSet可以确保集合元素处于排序状态。

TreeSet并不是根据元素的插入顺序进行排序的，而是根据元素实际值的大小来进行排序的。

**EnumSet**

EnumSet是一个专为枚举类设计的集合类，EnumSet中的所有元素都必须是指定枚举类型的枚举值，该枚举类型在创建EnumSet时显式或隐式地指定。EnumSet的集合元素也是有序的，EnumSet以枚举值在Enum类内的定义顺序来决定集合元素的顺序。

---

### Map集合

Map用于保存具有映射关系的数据，因此Map集合里保存着两组值，一组值用于保存Map里的key，另外一组值用于保存Map里的value，key和value都可以是任何引用类型的数据。

Map的继承关系，如图：

![Map](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/Map.png)

`HashMap`和`Hashtable`都是Map接口的典型实现类，它们之间的关系完全类似于`ArrayList`和`Vector`的关系

> Hashtable是一个线程安全的Map实现，但HashMap是线程不安全的实现
>
> Hashtable不允许使用null作为key和value

`HashMap`、`Hashtable`也不能保证其中key-value对的顺序。

`Properties`类是`Hashtable`类的子类，正如它的名字所暗示的，该对象在处理属性文件时特别方便（Windows操作平台上的ini文件就是一种属性文件）。

`TreeMap`就是一个红黑树数据结构，每个key-value对即作为红黑树的一个节点。`TreeMap`存储key-value对（节点）时，需要根据key对节点进行排序。

> **ArrayList和Vector的显著区别**：ArrayList是线程不安全的，当多个线程访问同一个ArrayList集合时，如果有超过一个线程修改了ArrayList集合，则程序必须手动保证该集合的同步性；但Vector集合则是线程安全的，无须程序保证该集合的同步性。

---
### Java多线程编程

Java是多线程的编程语言，有利于并发访问处理。

继承**Thread类**实现多线程

多线程的执行的方法在`run()`中定义，

start()方法是并发执行

每一个线程类对象只允许启动一次，如果重复启动，就会抛出异常

![JVM线程](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/JVM线程.png)


`Runnable`接口的使用

```java
Thread th=new Thread(new MyThread("线程1启动"));
th.start();
```

**Thread与Runnable关系**

Thread用于实现Runnable，如图所示：

![Thread与Runnable](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/Thread.png)

多线程的设计之中，使用了代理设计模式的结构，用户设计的线程主体负责项目核心功能，其他辅助功能由Thread类实现

多线程开发的本质实质上是在于多个线程可以进行统一资源的抢占

**Callable实现多线程**

`Callable`的定义

```java
@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}
```

如图Callable的继承关系：

![Callable的继承关系](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/Callable.png)


| Runnable                 | Callable           |
| ------------------------ | ------------------ |
| JDK1.0                   | JDK1.5             |
| 只有void run()，无返回值 | V call()，有返回值 |

### 线程常用操作方法

构造方法`public Thread(Runnable target, String name)`

设置名字`public final synchronized void setName(String name)`

取得名字`public final String getName()`

使用Java命令就会启动一个JVM的进程，一台电脑可以同时启动若干个JVM进程

主线程可以创建若干个子线程，主线程负责处理整体流程，而子线程负责处理耗时操作


**线程休眠**

两种休眠处理方式

一个参数，毫秒：`public static native void sleep(long millis) throws InterruptedException;`

两个参数，毫秒纳秒`public static void sleep(long millis, int nanos)throws InterruptedException`


休眠的主要特点是自动实现线程的唤醒，以继续进行后续的处理，多个线程休眠是有顺序的

**线程中断**

所有的线程都能被中断，线程中断必须进行异常处理


**线程的强制执行**

正常情况下主线程和子线程交替执行

强制执行`public final void join() throws InterruptedException`


**线程礼让**

礼让方法：`public static native void yield();`

**线程优先级**

设置优先级`public final void setPriority(int newPriority)`

获取优先级`public final int getPriority()`

三个优先级常量

```java
public final static int MIN_PRIORITY = 1;
public final static int NORM_PRIORITY = 5;
public final static int MAX_PRIORITY = 10;
```

优先级高的最有可能先执行，并不是绝对先执行

### 线程的同步与死锁

**同步问题的引出**

系统休眠或网络延迟会产生数据不同步问题

**线程同步**

解决同步问题的关键是锁

关键字`synchronized`

同步实际上会使系统的性能降低

解决同步问题的两种方法：同步代码块和同步方法

**线程死锁**

线程死锁就是若干个线程互相等待的状态

死锁是开发中不确定的状态

若干个线程访问同一资源时一定要进行同步处理，而过多的同步则会造成死锁

### 基础类库

**StringBuffer类**

构造方法：`public StringBuffer()`

构造方法：`public StringBuffer(String str)`

基本操作方法：

```java
public static void main(String[] args) {
    StringBuffer sb=new StringBuffer("baidu");
    sb.append(".com").insert(0,"www.");
    System.out.println(sb);
    sb.delete(0,4);
    System.out.println(sb);
}
```

字符串反转：`sb.reverse()`

`StringBuffer`属于线程安全的全部使用`synchronized`，`StringBuilder`是非线程安全的。

**CharSequence接口**

CharSequence是描述字符串结构的接口

| String                                                       | StringBuffer                                                 | StringBuilder                                                |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| public final class String<br/>extends Object<br/>implements Serializable, Comparable<String>, **CharSequence** | public final class StringBuffer<br/>extends Object<br/>implements Serializable, **CharSequence** | public final class StringBuilder<br/>extends Object<br/>implements Serializable, **CharSequence** |

**Runtime类**

在每一个JVM只允许提供有一个Runtime类的对象，所以这个类的构造方法被默认私有化了

**System类**

- 数组拷贝：`public static native void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);`

- 获取当前日期时间数值：`public static native long currentTimeMillis();`

- 进行垃圾回收：`public static void gc()`

**Math类**

Math类的全部方法:

```java
/**
* 指定小数位数四舍五入
* @param: [num, scale]
* @return: double
*/
public static double round(double num,int scale){
    return Math.round(num*Math.pow(10,scale))/Math.pow(10,scale);
}
```

**Random类**

生成不包含边界的随机正整数：`public int nextInt(int bound)`