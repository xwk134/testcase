package cn.sxt.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("aa");
        set1.add("bb");
        set1.add("cc");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("aa");
        set2.add("dd");

        set2.addAll(set1);
        System.out.println(set2);
    }
}
