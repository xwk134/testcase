package cn.sxt.oo;
//面向对象 继承案例
public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.height = 175;
        stu.rest();
        Student stu2 = new Student("李四",175,"富二代");
        System.out.println(stu2.name);
        System.out.println(stu2 instanceof Student);
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会");
    }

}
class Student extends Person{
    String major;
    public void study(){
        System.out.println("学习两小时");
    }
    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
    public Student(){

    }
}