package cn.sxt.oo;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
        //调用Person1类中方法
        Person1 p1 = new Person1();
        p1.setAge(20);
        System.out.println(p1.getAge());
    }
}

class FatherClass {
    public  int value;
    public void f(){
        value = 100;
        System.out.println("FatherClass:"+value);
    }
}

class ChildClass extends FatherClass {
    public int value;
    public void f() {
        super.f();  //调用父类对象的普通方法
        value = 200;
        System.out.println("ChildClass:"+value);
        System.out.println(value);
        System.out.println(super.value);    //调用父类对象的成员变量
    }
}
