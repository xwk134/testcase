package cn.sxt.collection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        set.add(800);
        set.add(400);
        set.add(600);
        for(Integer m:set) {
            System.out.println(m);
        }
    }
}
