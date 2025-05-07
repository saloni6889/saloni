//12.Display database name, version, list of tables, and supported SQL features.

package Module7_LabAssign;

import java.sql.*;

public class DatabaseInfo7_2 {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
        String username = "root";  
        String password = "";    

        Connection conn = null;

        try {
         
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

           
            DatabaseMetaData metaData = conn.getMetaData();

           
            System.out.println("Database Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close(); 
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
