package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
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

}

