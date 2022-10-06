package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"张三",10000);
        Employee e2 = new Employee(1002,"李四",4000);
        Employee e3 = new Employee(1003,"王五",7000);

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);

        Employee emp = map.get(1002);
        System.out.println(emp.getName());
        System.out.println(map);
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}