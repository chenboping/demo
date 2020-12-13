package com.example.demo.dao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
/**
 * @ClassName: User
 * @Description: TODO
 * @author: cbp
 * @date:
 */

public class User {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/userdemo?serverTimezone=UTC";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        Connection connection = null;
        try {
            //加载mysql的驱动类
            Class.forName(DRIVER_NAME);
            //获取数据库连接
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            //mysql查询语句
            String sql = "SELECT username FROM stu";
            PreparedStatement priest = connection.prepareStatement(sql);
            //结果集
            ResultSet rs = priest.executeQuery();
            while (rs.next()) {
                System.out.println("用户名:" + rs.getString("username"));
            }
            rs.close();
            priest.close();
        }  catch (ClassNotFoundException | SQLException cafe)
        {
            cafe.printStackTrace();
        }

    }
}

