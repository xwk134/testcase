package com.jdbc;

import java.io.IOException;
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
}
