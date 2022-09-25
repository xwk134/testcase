package cn.sxt.oo2;

public class TestAbstractClass {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.shout();
        a.seeDoor();
    }
}

//抽象方法
abstract class Animal {
    abstract public void shout(); //抽象方法
}

class Dog extends Animal {
    //子类必须实现父类的抽象方法
    public void shout() {
        System.out.println("汪汪汪");
    }
    public void seeDoor() {
        System.out.println("看门中");
    }
}
