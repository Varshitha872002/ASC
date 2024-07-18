

import java.sql.*;

class JdbcExample {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mysql");

            // Create a Statement object
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM actor");

            // Process the results
            while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Driver Loaded!");
        }
    }
}
