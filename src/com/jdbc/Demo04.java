package com.jdbc;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo04 {
    public static void main(String[] args) throws SQLException {
        add();
        select();
        update();
        delete();
    }

    public static void add() throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        //获取执行sql语句的对象
        PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?)");
        ps.setInt(1,3);
        ps.setString(2,"root");
        ps.setString(3,"root");
        int info = ps.executeUpdate();
        System.out.println(info);
        //释放资源
        JdbcUtils.close(conn,ps);
    }

    public static void select () throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        //获取执行sql语句的对象
        PreparedStatement ps = conn.prepareStatement("select * from user where id = ?");
        ps.setInt(1,3);
        ResultSet info = ps.executeQuery();
        // 展开结果集数据库
        while(info.next()){
            // 通过字段检索
            int id  = info.getInt("id");
            String username = info.getString("username");
            String password = info.getString("password");
            // 输出数据
            System.out.print("id: " + id);
            System.out.print(", username: " + username);
            System.out.print(", password: " + password);
            System.out.print("\n");
        }
        //释放资源
        JdbcUtils.close(conn,ps,info);
    }
    public static void update () throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        //获取执行sql语句的对象
        PreparedStatement ps = conn.prepareStatement("update user set username = ? where id = ?");
        ps.setString(1,"root1");
        ps.setInt(2,3);
        int info = ps.executeUpdate();
        System.out.println(info);
        //释放资源
        JdbcUtils.close(conn,ps);
    }

    public static void delete () throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        //获取执行sql语句的对象
        PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");
        ps.setInt(1,3);
        int info = ps.executeUpdate();
        System.out.println(info);
        //释放资源
        JdbcUtils.close(conn,ps);
    }
}
