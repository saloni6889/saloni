//4.Research and explain the best JDBC driver for your database and Java environment.

package Module7_LabAssign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLJDBC2_2 {
    public static void main(String[] args) {
      
        String url = "jdbc:mysql://localhost:3306/mydatabase?useSSL=true&serverTimezone=UTC";
        String username = "root";
        String password = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connection to MySQL database successful!");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
