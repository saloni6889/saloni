//2.Demonstrate the process of loading a JDBC driver and establishing a connection.
 
package Module7_LabAssign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC1_2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String username = "root";  
        String password = "";  

        Connection conn = null;

        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded!");

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database!");

            String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, 1);  
            stmt.setString(2, "Saloni Yadav");
            stmt.setString(3, "saloni@example.com");  
            
            stmt.executeUpdate();
            System.out.println("Data inserted into the 'users' table.");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Connection failed! Check your username, password, and URL.");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error closing the connection.");
                e.printStackTrace();
            }
        }
    }
}