package cn.sxt.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treemap1 = new TreeMap<>();
        treemap1.put(20,"aa");
        treemap1.put(4,"bb");
        treemap1.put(6,"cc");

        //按照key递增的方式排序
        for(Integer key:treemap1.keySet()){
            System.out.println(key+"----"+treemap1.get(key));
        }
    }
}
