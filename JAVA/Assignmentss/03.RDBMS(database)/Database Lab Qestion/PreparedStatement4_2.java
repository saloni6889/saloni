//7.Modify the program to use PreparedStatement for parameterized queries.

package Module7_LabAssign;

import java.sql.*;

public class PreparedStatement4_2 {

    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String username = "root";  
        String password = "";      

        try {
            // 1. Connect to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // 2. Insert Data
            String insertSql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, 1);  // Set ID
            insertStmt.setString(2, "Saloni Yadav");  
            insertStmt.setString(3, "Saloni@example.com");  
            insertStmt.executeUpdate(); 
            System.out.println("Inserted data into 'users' table.");

            // 3. Update Data
            String updateSql = "UPDATE users SET name = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, "Neha Saloni");  
            updateStmt.setInt(2, 1);  
            updateStmt.executeUpdate();  
            System.out.println("Updated data in 'users' table.");

            // 4. Select Data
            String selectSql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectStmt = conn.prepareStatement(selectSql);
            selectStmt.setInt(1, 1);  // Set ID for selection
            ResultSet rs = selectStmt.executeQuery();  // Execute the select query
            while (rs.next()) {
                // Print selected data
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 5. Delete Data
            String deleteSql = "DELETE FROM users WHERE id = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setInt(1, 1);  
            deleteStmt.executeUpdate();  
            System.out.println("Deleted data from 'users' table.");

            conn.close();
            System.out.println("Connection closed.");

        } catch (SQLException e) {
 
            System.out.println("Error: " + e.getMessage());
        }
    }
}
