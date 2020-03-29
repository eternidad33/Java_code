package test;

import java.util.Random;

/**
 * 项目名 Java_code
 * <br>包名 test
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 16:26
 * <br>描述
 */
class Coin {
    private int front;
    private int back;
    private Random random = new Random();

    public void throwCoins(int num) {
        for (int i = 0; i < num; i++) {
            int temp = random.nextInt(2);
            if (temp == 0) {
                this.front++;
            } else {
                this.back++;
            }
        }
    }

    public int getFront() {
        return this.front;
    }

    public int getBack() {
        return this.back;
    }
}

public class CoinTest {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.throwCoins(1000);
        System.out.println("正面出现的次数:" + coin.getFront());
        System.out.println("背面出现的次数:" + coin.getBack());
    }
}
