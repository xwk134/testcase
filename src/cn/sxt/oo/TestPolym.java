package cn.sxt.oo;
//面向对象-多态案例

public class TestPolym {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        animalCry(a1);
    }

    static void animalCry(Animal a) {
        a.shout();
    }
}

class Animal {
    public void shout() {
        System.out.println("叫了一声");
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}