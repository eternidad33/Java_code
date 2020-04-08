package vo;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * 项目名 Java_code
 * <br>包名 vo
 * <br>创建时间 2020/4/8 16:43
 * <br>描述
 *
 * @author Vigilr
 */
class Order {

    /**
     * name : 商品名称
     * price : 5
     * count : 10
     */

    private String name;
    private int price;
    private int count;

    public Order(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public class MapReduceDemo {
    public static void main(String[] args) {
        List<Order> all = new ArrayList<>();
        all.add(new Order("小米手机", 2000, 8));
        all.add(new Order("小米手环", 169, 5));
        all.add(new Order("小米电视", 1000, 2));
        all.add(new Order("小米笔记本", 3000, 3));
        all.add(new Order("华为手机", 2000, 3));
        DoubleSummaryStatistics stat =
                all.stream().filter((ele) -> ele.getName().contains("小米")).mapToDouble((olderObject) -> olderObject.getPrice() * olderObject.getCount()).summaryStatistics();
        System.out.println("购买数量：" + stat.getCount());
        System.out.println("购买总价：" + stat.getSum());
        System.out.println("平均花费：" + stat.getAverage());
        System.out.println("最低花费：" + stat.getMin());
        System.out.println("最高花费：" + stat.getMax());
    }
}