package cn.sxt.oo;
//面向对象-封装案例

public class Person1 {
    //属性一般使用private私用属性修饰，只能在当前类内使用
    private int id;
    private String name;
    private int age;
    private boolean man;
    //为属性提供public修饰的set/get方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        if(age>=1&&age<=130) {
            this.age = age;
        }else{
            System.out.println("请输入正确的年龄");
        }
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
