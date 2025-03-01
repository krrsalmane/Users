package com.doctorrv2.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/doctorrv";

    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "salmane@1013";


    private static Connection connection = null;

    private DBconnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                System.out.println("Database connection established successfully.");
            } catch (ClassNotFoundException e) {
                System.err.println("JDBC Driver not found: " + e.getMessage());
                throw new SQLException("Database driver not found", e);
            } catch (SQLException e) {
                System.err.println("Connection failed: " + e.getMessage());
                throw e;
            }
        }
        return connection;
    }

        }

