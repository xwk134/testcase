package com.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static {
        Properties p = new Properties();
        try {
            p.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            username = p.getProperty("username");
            password = p.getProperty("password");
            //注册驱动
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        //获取数据连接对象
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
    public static void close(Connection conn,PreparedStatement ps){
        close(conn,ps,null);
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
