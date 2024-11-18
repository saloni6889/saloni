//8.Write a Java program that performs the following CRUD operations:
// Insert a new record.
// Update an existing record.
// Select and display records.
// Delete a record from the database.

package Module7_LabAssign;

import java.sql.*;

public class CURDOperation5_1 {

    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String username = "root";  
        String password = "";    

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            String insertSql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, 1); 
            insertStmt.setString(2, "Neha Yadav");  
            insertStmt.setString(3, "Neha.Yadav@example.com");  
            insertStmt.executeUpdate();  
            System.out.println("Inserted new user record into 'users' table.");

            // Update operation (Update)
            String updateSql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, "Neha Saloni");  
            updateStmt.setString(2, "Neha.Saloni@example.com"); 
            updateStmt.setInt(3, 1);  
            updateStmt.executeUpdate();  
            System.out.println("Updated user record in 'users' table.");

            // Select operation (Read)
            String selectSql = "SELECT * FROM users";
            Statement selectStmt = conn.createStatement();
            ResultSet rs = selectStmt.executeQuery(selectSql);
            System.out.println("Displaying all user records:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // Delete operation (Delete)
            String deleteSql = "DELETE FROM users WHERE id = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setInt(1, 1);  
            deleteStmt.executeUpdate(); 
            System.out.println("Deleted user record from 'users' table.");

            conn.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
