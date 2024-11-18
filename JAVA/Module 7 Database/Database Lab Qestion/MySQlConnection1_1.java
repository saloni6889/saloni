//1.Write a simple Java program to connect to a MySQL database using JDBC.

package Module7_LabAssign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

	public class MySQlConnection1_1 {
	    public static void main(String[] args) {
	        
	        String url = "jdbc:mysql://localhost:3306/mydatabase";  
	        String username = "root";  
	        String password = "";  

	        Connection conn = null;
	        Statement stmt = null;

	        try {
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("JDBC Driver loaded!");

	            
	            conn = DriverManager.getConnection(url, username, password);
	            System.out.println("Connection established successfully!");

	           
	            stmt = conn.createStatement();

	            String sql = "INSERT INTO users (id, name, email) VALUES (1, 'saloni', 'saloni@example.com')";
	            stmt.executeUpdate(sql);
	            System.out.println("Data inserted into the 'users' table.");

	        } catch (Exception e) {
	           
	            System.out.println("Connection failed! Check your username, password, and URL.");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	
	
