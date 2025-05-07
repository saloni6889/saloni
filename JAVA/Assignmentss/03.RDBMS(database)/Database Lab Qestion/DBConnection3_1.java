//5.Write a Java program to establish a connection to a database and print a
//confirmation message upon successful connection.

package Module7_LabAssign;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection3_1 {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");

            System.out.println("Successfully connected to the database!");

            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
