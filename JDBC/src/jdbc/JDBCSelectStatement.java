package jdbc;

import java.sql.*;

public class JDBCSelectStatement {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mysql");
            System.out.println("Connection established!");
            Statement stmt = conn.createStatement();
            System.out.println("Statement Created");
            ResultSet rs = stmt.executeQuery("select * from actor order by actor_id limit 5");
            System.out.println("Result set returned");
            while(rs.next()) {
                System.out.println("actor id: " + rs.getInt("actor_id") + "First name: " + rs.getString("first_name") + "Last name: " + rs.getString("last_name") + "Last Update: " + rs.getString("last_update"));
                System.out.println("************");

            }
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
    }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }
        }
}
