package com.maksud.jdbc.starter;


import com.maksud.jdbc.starter.util.ConnectionManager;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.StatementImpl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = ConnectionManager.open()) {// так мы подключаемся к базе данных
            Statement statement = new StatementImpl((JdbcConnection) connection,"mySQL");
//            statement.executeQuery("from Employees ");

        }
    }
}
