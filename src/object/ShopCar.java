package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/8 19:07
 */
interface IGoods {
    public String getName();

    public double getPrice();
}

interface IShopCar {
    public void add(IGoods goods);

    public void delete(IGoods goods);

    public Object[] getAll();
}

class Cashier {//收银台
    private IShopCar shopCar;

    public Cashier(IShopCar shopCar) {
        this.shopCar = shopCar;
    }

    public double allprice() {//计算总价
        double all = 0.0;
        Object result[] = this.shopCar.getAll();
        for (Object obj : result) {
            IGoods goods = (IGoods) obj;
            all += goods.getPrice();
        }
        return all;
    }

    public int count() {
        return this.shopCar.getAll().length;
    }
}

class Book implements IGoods {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) {
            return false;
        }
        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}


public class ShopCar implements IShopCar {
    private ILink<IGoods> allGoods = new LinkImpl<>();

    @Override
    public void add(IGoods goods) {
        this.allGoods.add(goods);
    }

    @Override
    public void delete(IGoods goods) {
        this.allGoods.remove(goods);
    }

    @Override
    public Object[] getAll() {
        return this.allGoods.toArray();
    }

    public static void main(String[] args) {
        IShopCar car = new ShopCar();
        car.add(new Book("Java开发", 88.88));
        car.add(new Book("SQL", 123.23));
        Cashier cash = new Cashier(car);
        System.out.println(cash.allprice());
        System.out.println(cash.count());
    }
}
