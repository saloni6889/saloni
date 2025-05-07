package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db_connection.dbconnection;
import Model.Customer;
import Model.weddingplanner;

public class CustomerDao {
	public static void insertUser(Customer u) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();//DML
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from customer where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();//DQL
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Customer loginUser(Customer u) {
		Customer u1 = null;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from customer where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs =  pst.executeQuery();
			System.out.println("result set data : "+rs);
			if(rs.next()) {
				u1 = new Customer();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setContact(rs.getLong("contact"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
	public static Customer getCustomerByid(int id) {
		Customer u1 = null;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from customer where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs =  pst.executeQuery();
			System.out.println("result set data : "+rs);
			if(rs.next()) {
				u1= new Customer();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setContact(rs.getLong("contact"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}
public static List<Customer> getAllCustomers(){
	List<Customer> list1 = new ArrayList<Customer>();
	try {
		Connection conn = dbconnection.createConnection();
		String sql = "select * from customer";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Customer u1 = new Customer();
			u1.setId(rs.getInt("id"));
			u1.setName(rs.getString("name"));
			u1.setContact(rs.getLong("contact"));
			u1.setAddress(rs.getString("address"));
			u1.setEmail(rs.getString("email"));
			u1.setPassword(rs.getString("password"));
			list1.add(u1);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return list1;
  }
}