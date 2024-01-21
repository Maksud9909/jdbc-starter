package com.maksud.jdbc.starter;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "bestuser";
        String password = "bestuser";
        try (Connection connection = DriverManager.getConnection(url,user,password)) {// так мы подключаемся к базе данных
            System.out.println(connection.getTransactionIsolation());
        }



    }
}
