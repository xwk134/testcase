package File;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        //随机生成[0,1]之间的double类型的数据
        System.out.println(rand.nextDouble());
        //随机生成[0,10]之间的int类型的数据
        System.out.println(rand.nextInt(10));
        //随机生成[10,20]之间的int类型的数据
        System.out.println(10+ rand.nextInt(10));

    }
}
