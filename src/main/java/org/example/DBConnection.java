package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_75_db";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "DAka@24381";

    private static DBConnection dbConnection;
    private final Connection connection;

    // Get DBConnection and Set to Session
    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    // Do you create before new DBConnection
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnection==null) {
            return new DBConnection();
        }
        return dbConnection;
    }

    // return Connection Object
    public Connection getConnection() {
        return connection;
    }
}
