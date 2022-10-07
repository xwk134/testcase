package cn.sxt.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//迭代器遍历Map

public class TestIterator1 {
    public static void main(String[] args) {
        testIteratorMap();
    }

    public static void testIteratorMap(){
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(100,"aa");
        map1.put(103,"cc");
        map1.put(102,"dd");
        //第一种遍历Map的方式
        Set<Map.Entry<Integer,String>> ss = map1.entrySet();

        for(Iterator<Map.Entry<Integer,String>> iter = ss.iterator(); iter.hasNext();){
            Map.Entry<Integer,String> temp = iter.next();
            System.out.println(temp.getKey()+"---"+temp.getValue());
        }

        //第二种遍历Map的方式
        Set<Integer> keyset = map1.keySet();
        for(Iterator<Integer> iter = keyset.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println((key+"-----"+map1.get(key)));
        }

    }
}
