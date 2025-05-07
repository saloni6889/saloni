//o Create a stored procedure in MySQL with IN and OUT parameters (e.g., a procedure
//that takes an employee ID as input and returns the employee's full name as output).
//o Write a Java program that uses CallableStatement to call this stored procedure.
//o Demonstrate how to pass IN parameters and retrieve OUT parameters.

package Module7_LabAssign;

import java.sql.*;
import java.math.BigDecimal;

public class Storeprocedure11 {
    public static void main(String[] args) {
       
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root"; 
        String password = "";

        int empId = 101; 
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            String sql = "{call GetEmployeeFullName(?, ?)}"; 
            
            try (CallableStatement stmt = conn.prepareCall(sql)) {

                stmt.setInt(1, empId);

                stmt.registerOutParameter(2, Types.VARCHAR); 

                stmt.execute();
                
                String fullName = stmt.getString(2);

                if (fullName == null) {
                    fullName = "Not Found";
                }

                System.out.println("Employee Full Name: " + fullName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
