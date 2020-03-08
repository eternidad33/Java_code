package object;

import java.util.Objects;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/8 18:26
 */
interface Pet {
    public String getName();

    public String getColor();
}

class Cat implements Pet {
    private String name;
    private String color;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Dog implements Pet {
    private String name;
    private String color;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog cat = (Dog) o;
        return Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class PetShop {
    public ILink<Pet> allPets = new LinkImpl<>();//用于保存多个宠物

    public void add(Pet pet) {//追加宠物
        this.allPets.add(pet);
    }

    public void delete(Pet pet) {
        this.allPets.remove(pet);
    }

    public ILink<Pet> search(String keyword) {
        ILink<Pet> searchResult = new LinkImpl<>();//用于保存查询结果
        Object result[] = this.allPets.toArray();//获取全部数据
        if (result != null) {
            for (Object obj : result) {
                Pet pet = (Pet) obj;
                if (pet.getName().equals(keyword) || pet.getColor().equals(keyword)) {
                    searchResult.add(pet);
                }
            }
        }
        return searchResult;
    }

    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("黑猫", "黑"));
        shop.add(new Dog("白狗", "白色"));
        shop.add(new Cat("黄猫", "黄色"));
        shop.add(new Dog("黄白狗", "黄色"));
        Object result[] = shop.search("黄色").toArray();
        for (Object obj : result) {
            System.out.println(obj);
        }
    }
}
