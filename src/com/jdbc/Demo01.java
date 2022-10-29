package com.jdbc;

import java.sql.*;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Properties data = new Properties();
        data.setProperty("user","root");
        data.setProperty("password","123456");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?useUnicode=true&characterEncoding=utf8",data);
        //获取执行sql语句的对象
        Statement stat = conn.createStatement();
        //执行sql语句
        int info = stat.executeUpdate("insert into teacher value (807,'李四','男','1997-09-09','讲师','计算机系')");
        System.out.println(info);
        //释放资源
        stat.close();
        conn.close();

    }
}
