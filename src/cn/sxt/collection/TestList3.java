package cn.sxt.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList3 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
      List<String> list = new ArrayList<>();
      list.add("a");
      list.add("b");

      list.add("c");
      list.add("d");
      System.out.println(list);
      list.add(2,"1");
      System.out.println(list);
      list.set(2,"2");
      System.out.println(list);
      System.out.println(list.get(2));

      System.out.println(list.indexOf("a"));
      System.out.println(list.lastIndexOf("d"));
    }
}
