package cn.sxt.oo3;

public class Person {
    private String name="张三";
    private int age=12;
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name+":"+person.age);
    }
}
