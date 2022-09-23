package cn.sxt.oo;

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
    }
}

class Vehicle { //交通工具类
    public void run() {
        System.out.println("跑......");
    }
    public void stop() {
        System.out.println("停止不动");
    }
}

class Horse extends Vehicle {
    public void run() {
        System.out.println("马不停蹄");
    }
}
