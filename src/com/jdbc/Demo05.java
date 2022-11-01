package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo05 {
    public static void main(String[] args) throws SQLException {
        //获取数据库连接
        Connection conn = JdbcUtils.getConnection();
        //开启事务
        conn.setAutoCommit(false);
        //获取执行sql语句对象
        PreparedStatement ps = conn.prepareStatement("update user set age = age + ? where id = ?");
        //李四减两岁
        ps.setInt(1,-2);
        ps.setInt(2,2);
        int info = ps.executeUpdate();
        System.out.println(info);
        //张三加2岁
        ps.setInt(1,2);
        ps.setInt(2,4);
        ps.executeUpdate();
        //提交事务
        conn.commit();
        //释放资源
        JdbcUtils.close(conn,ps);
    }
}
