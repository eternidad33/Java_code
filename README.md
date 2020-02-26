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
```java
int data[][] = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
for (int temp[] : data) {
    for (int num : temp) {
        System.out.print(num + ",");
    }
    System.out.println();
}
```
返回数组的方法  
```java
public static int[] initArray(){
    int arr[]=new int[]{1,2,3,4,5};
    return arr;
}
```
将数组封装成一个组件  
```java
class ArrayUtil{
    public int getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    private int sum;
    private double avg;
    private int min;
    private int max;
    public ArrayUtil(int[] data){
        this.sum=0;
        this.max=data[0];
        this.min=data[0];
        for(int num:data){
            this.sum+=num;
            if(num>this.max)
                this.max=num;
            if(num<this.min)
                this.min=num;
        }
        this.avg=this.sum/data.length;
    }
}
```

数组快速排序  
```java
public static int[] sort(int data[]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if(data[j]>data[j+1]){
                    int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return data;
    }
```
数组逆序
````java
public static int[] reverse(int data[]){
    int head=0;
    int tail=data.length-1;
    for(int i=0;i<data.length/2;i++){
        int temp=data[head];
        data[head]=data[tail];
        data[tail]=temp;
        head++;
        tail--;
    }
    return data;
}
````
数组相关的类库  
数组排序可以这样写`java.util.Arrays.sort(data);`  
系统自带的数组拷贝
```java
public static void main(String[] args) {
    int dataA[]=new int[]{1,2,3,4,5,6,7,8,9};
    int dataB[]=new int[]{11,22,33,44,55,66,77,88,99};
    System.arraycopy(dataA,5,dataB,5,3);
    printArray(dataB);
    System.out.println();
    printArray(dataA);
}
```
运行结果：
```
11,22,33,44,55,6,7,8,99,
1,2,3,4,5,6,7,8,9,
```

`System.arraycopy(dataA,5,dataB,5,3);`是将数组dataA中从索引为5，长度为3的一段数组复制到dataB中索引位置为5的地方，并替换掉相应长度
可变参数
```java
class ArrayUtil{
    public static int sum(int ... data){
        int sum=0;
        for(int temp:data){
            sum+=temp;
        }
        return sum;
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(ArrayUtil.sum(1,2,3));
        System.out.println(ArrayUtil.sum(new int[]{1,2,3}));
    }
}
```
在方法参数列表中`...`表示可变参数  
可变参数的作用在于，在以后进行一些程序设计或者开发者调用的时候，利用此种形式可以避免数组的传递操作
## Java高级进阶
