<<<<<<< HEAD
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
=======
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
