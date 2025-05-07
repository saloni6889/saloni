//10.Demonstrate how to navigate through the ResultSet using methods like next(),
//previous(), etc.

package Module7_LabAssign;

import java.sql.*;

public class ResultSetNavigation6_2 {

    public static void main(String[] args) {
   
        String url = "jdbc:mysql://localhost:3306/mydatabase";  
        String username = "root";  
        String password = "";    

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            String selectQuery = "SELECT id, name, email FROM users";  

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = stmt.executeQuery(selectQuery);

            // 1. Move the cursor to the first row
            if (rs.first()) {
                System.out.println("First row:");
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 2. Move the cursor to the last row
            if (rs.last()) {
                System.out.println("\nLast row:");
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 3. Move the cursor to the previous row from the last row
            if (rs.previous()) {
                System.out.println("\nPrevious row from last:");
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 4. Move the cursor to the second row using absolute positioning
            if (rs.absolute(2)) {
                System.out.println("\nSecond row using absolute method:");
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 5. Move the cursor to the first row again
            if (rs.first()) {
                System.out.println("\nFirst row again:");
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 6. Iterate over the ResultSet using next() (Forward only)
            System.out.println("\nAll rows using next():");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }

            // 7. Close the ResultSet and Statement
            rs.close();
            stmt.close();
            
            conn.close();
            System.out.println("\nConnection closed.");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
