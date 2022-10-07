package cn.sxt.collection;

import java.util.*;
//测试表格数据的存储
public class TestStoreData {
    public static void main(String[] args) {
        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("姓名","张三");
        row1.put("工资",5999);
        row1.put("入职日期","2004-02-27");

        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("姓名","李四");
        row2.put("工资",3999);
        row2.put("入职日期","2005-02-27");

        Map<String,Object> row3 = new HashMap<>();
        row3.put("id",1003);
        row3.put("姓名","王五");
        row3.put("工资",7999);
        row3.put("入职日期","2008-02-27");

        List<Map<String,Object>> table = new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);

        for (Map<String,Object> row:table){
            Set<String> keyset = row.keySet();
            for (String key:keyset){
                System.out.print(key+":"+row.get(key)+"\t");
            }
            System.out.println();
        }
    }
}
