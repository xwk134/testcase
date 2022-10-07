package cn.sxt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class TestStoreData2 {
    public static void main(String[] args) {
        User user1 = new User(1001,"张三",4009,"2003-08-13");
        User user2 = new User(1002,"李四",5009,"2002-08-13");
        User user3 = new User(1003,"王五",7009,"2006-08-13");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User u:list){
            System.out.println(u);
        }

    }
}

class User{
    private int id;
    private String name;
    private double salary;
    private String hiredate;

    public User(){
    }

    public User(int id, String name, double salary, String hiredate){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }
}