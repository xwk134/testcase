package com.jdbc;

import org.apache.commons.io.output.AppendableOutputStream;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean a=login(username,password);
        if(a) {
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }

    public static boolean login(String username, String password) throws SQLException, ClassNotFoundException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Properties data = new Properties();
        data.setProperty("user","root");
        data.setProperty("password","123456");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?useUnicode=true&characterEncoding=utf8",data);
        //获取执行sql语句的对象
//        Statement stat = conn.createStatement();
//        //执行sql语句
//        ResultSet info = stat.executeQuery("select*from user where username='"+username+"'and password='"+password+"'");
////        System.out.println(info.next());
//        return info.next();
        PreparedStatement ps = conn.prepareStatement("select*from user where username= ? and password = ?");
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet info = ps.executeQuery();
        System.out.println(info.next());
        return info.next();

    }
}
