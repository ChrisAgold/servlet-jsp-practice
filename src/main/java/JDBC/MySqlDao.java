//package JDBC;
//
//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MySQLDao implements employees_database {
//    private Connection connection = null;
//
//    public MySQLDao() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/adlister_db",
//                    "root",
//                    "codeup"
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error talking to the database!", e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("Error initializing the MySQL driver.", e);
//        }
//    }

