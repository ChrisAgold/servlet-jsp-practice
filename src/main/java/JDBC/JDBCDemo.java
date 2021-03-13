package JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        try {
            // Establish Connection Object

            // create a statement object to send to the database
            Statement statement = conn.createStatement();

            // Execute the statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_database.employees_tbl");

            // Process the result
            while(resultSet.next()) {
                System.out.println(resultSet.getString("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
