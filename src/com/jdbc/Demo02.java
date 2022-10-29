package com.jdbc;

import java.sql.*;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Properties data = new Properties();
        data.setProperty("user","root");
        data.setProperty("password","admin");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping?useUnicode=true&characterEncoding=utf8",data);
        //获取执行sql语句的对象
        Statement stat = conn.createStatement();
        //执行sql语句
        ResultSet info = stat.executeQuery("select*from user where id=1");
        // 展开结果集数据库
        while(info.next()){
            // 通过字段检索
            int id  = info.getInt("id");
            String name = info.getString("name");
            int age = info.getInt("age");
            String phone = info.getString("phone");
            // 输出数据
            System.out.print("id: " + id);
            System.out.print(", name: " + name);
            System.out.print(", age: " + age);
            System.out.print(", phone: " + phone);
            System.out.print("\n");
        }
        // 完成后关闭
        info.close();
        //释放资源
        stat.close();
        conn.close();

    }
}
