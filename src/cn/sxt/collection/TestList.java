package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("张三");
        c.add("李四");
        System.out.println(c);

        System.out.println(c.contains("李四"));

        Object[] objs = c.toArray();
        System.out.println(objs);

        c.remove("李四");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());
    }
}
