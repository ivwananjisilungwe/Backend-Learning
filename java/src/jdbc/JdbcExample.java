package jdbc;
// jdbc = java database connectivity
// allows java to connect to database and manipulate data using sql

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        // Example of connecting to a database and executing a query
        String url = "jdbc:postgresql://localhost:5432/MyDatabase";
        String username = "postgres";
        String password = "8407";
        
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("person_name") +
                        ", Birth Date: " + rs.getDate("birth_date") +
                        ", Phone: " + rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
