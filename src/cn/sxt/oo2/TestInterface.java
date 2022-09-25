package cn.sxt.oo2;

//接口的使用

public class TestInterface {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
        Honest honest = new GoodMan();
        honest.helpOther();
        BirdMan birdMan = new BirdMan();
        birdMan.fly();
    }
}

//飞行接口
interface Volant {
    int FLY_HIGHT = 100;
    void fly();
}

//善良接口
interface Honest {
    void helpOther();
}
//该类实现飞行接口和善良接口
class Angel implements Volant, Honest{
    public void fly() {
        System.out.println("我是天使,飞起来了");
    }
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}

class GoodMan implements Honest {
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}

class BirdMan implements Volant {
    public void fly() {
        System.out.println("我是鸟人，正在飞");
    }
}
