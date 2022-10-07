package cn.sxt.collection;

import com.sun.deploy.util.OrderedHashSet;

import javax.swing.text.html.parser.Entity;
import java.util.*;

//迭代器遍历list/set

public class TestIterator {
    public static void main(String[] args) {
//        testIteratorList();
        testIteratorMap();
    }
    public static void testIteratorList(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for(Iterator<String> iter = list.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }
    public static void testIteratorMap(){
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        for(Iterator<String> iter = set.iterator();iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }


}

