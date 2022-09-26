package cn.sxt.oo;

import java.awt.*;

//面向对象-多态案例
public class TestPolym {
    public static void main(String[] args) {
        //传的是哪一个类就调用哪一个类的方法,提高了程序的可扩展性。
        Animal a1 = new Duck();
        animalCry(a1);
    }
    /*有了多态，只需要让增加的这个类继承Animal类就可以了。
    如果没有多态，我们这里需要写很多重载的方法。
    每增加一种动物，就需要重载一种动物的喊叫方法。非常麻烦。*/
    static void animalCry(Animal a) {
        a.shout();
        a.species();
    }
}

class Animal {
    public void shout() {
        System.out.println("叫了一声");
    }
    public void species() {
        System.out.println("动物种类");
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪汪");
    }

    @Override
    public void species() {
        System.out.println("犬科");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }

    @Override
    public void species() {
        System.out.println("猫科");
    }
}

class Chicken extends Animal {
    @Override
    public void shout() {
        System.out.println("咯咯咯");
    }

    @Override
    public void species() {
        System.out.println("雉科");
    }
}

class Duck extends Animal {
    @Override
    public void shout() {
        System.out.println("嘎嘎嘎");
    }

    @Override
    public void species() {
        System.out.println("鸭科");
    }
}