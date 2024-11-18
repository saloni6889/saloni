//11.Write a program that retrieves and displays metadata information about your
//database using DatabaseMetaData.

package Module7_LabAssign;

import java.sql.*;

public class DatabaseMetaData7_1 {

    public static void main(String[] args) {
     
        String url = "jdbc:mysql://localhost:3306/mydatabase"; 
        String username = "root";
        String password = "";      

        Connection conn = null;

        try {
            
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            DatabaseMetaData dbMetaData = conn.getMetaData();

            System.out.println("Database Product Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbMetaData.getDriverName());
            System.out.println("Driver Version: " + dbMetaData.getDriverVersion());

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
