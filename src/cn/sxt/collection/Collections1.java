package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            aList.add("a" + i);
        }
        System.out.println(aList);
        Collections.shuffle(aList); // 随机排列
        System.out.println(aList);
        Collections.reverse(aList); // 逆续
        System.out.println(aList);
        Collections.sort(aList); // 排序
        System.out.println(aList);
        System.out.println(Collections.binarySearch(aList, "a2"));
        Collections.fill(aList, "hello"); //用一个特定的对象重写整个List容器
        System.out.println(aList);
    }
}
