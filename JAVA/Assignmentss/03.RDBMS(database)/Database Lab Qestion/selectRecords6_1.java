//9.Write a program that executes a SELECT query and processes the ResultSet to
//display records from the database.

package Module7_LabAssign;

import java.sql.*;

public class selectRecords6_1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String username = "root"; 
        String password = "";      

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            String selectQuery = "SELECT id, name, email FROM users";  

            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(selectQuery);

            
            System.out.println("User Records:");
            while (rs.next()) {
                int id = rs.getInt("id");       
                String name = rs.getString("name"); 
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            rs.close();
            stmt.close();

            conn.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }
}
