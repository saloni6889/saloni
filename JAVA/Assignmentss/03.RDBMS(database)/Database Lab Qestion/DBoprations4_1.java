//6.Create a program that inserts, updates, selects, and deletes data using Statement.

package Module7_LabAssign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBoprations4_1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";  // Database URL
        String username = "root";  
        String password = "";     

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Create a Statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // 1. Insert Data
            String insertSql = "INSERT INTO users (id, name, email) VALUES (1, 'Neha Yadav', 'Neha@example.com')";
            stmt.executeUpdate(insertSql);
            System.out.println("Inserted data into the 'users' table.");

            // 2. Update Data
            String updateSql = "UPDATE users SET name = 'Neha Yogesh' WHERE id = 1";
            stmt.executeUpdate(updateSql);
            System.out.println("Updated data in the 'users' table.");

            // 3. Select Data
            String selectSql = "SELECT * FROM users WHERE id = 1";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }
            // 4. Delete Data
            String deleteSql = "DELETE FROM users WHERE id = 1";
            stmt.executeUpdate(deleteSql);
            System.out.println("Deleted data from the 'users' table.");

            // Close the connection
            conn.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
