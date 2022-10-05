package cn.sxt.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList2 {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");
        System.out.println("list01:"+ list01);
        //list01.addAll(list02);
        //删除相同的元素
        //list01.removeAll(list02);
        //取交集
        list01.retainAll(list02);
        System.out.println("list01:"+ list01);
        //01是否包含02所有元素
        System.out.println(list01.containsAll(list02));

    }

}

