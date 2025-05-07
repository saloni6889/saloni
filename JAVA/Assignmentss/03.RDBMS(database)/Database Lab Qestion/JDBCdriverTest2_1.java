//3.Identify which driver your Java program uses to connect to MySQL.

package Module7_LabAssign;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class JDBCdriverTest2_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC driver loaded successfully!");

            Enumeration<Driver> drivers = DriverManager.getDrivers();

            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();  
                System.out.println("Loaded driver: " + driver.getClass().getName());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
