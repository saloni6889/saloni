package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db_connection.dbconnection;
import Model.weddingplanner;


public class weddingplannerDao {
	public static void insertUser(weddingplanner u) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "insert into weddingplanner(name,contact,address,email,password) values(?,?,?,?,?)";
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
			String sql = "select * from weddingplanner where email=?";
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

	public static weddingplanner loginUser(weddingplanner u) {
		weddingplanner u1 = null;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from weddingplanner where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs =  pst.executeQuery();
			System.out.println("result set data : "+rs);
			if(rs.next()) {
				u1 = new weddingplanner();
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
	public static void updateUser(weddingplanner u) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "update weddingplanner set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setInt(5, u.getId());
			pst.executeUpdate();
			System.out.println("data updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean checkPassword(String email,String op) {
		boolean flag = false;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from weddingplanner where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();//DQL
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void updatePassword(String email,String np) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "update weddingplanner set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("pass udpated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static weddingplanner getSingleWP(int id) {
		weddingplanner u1 = null;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from weddingplanner where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs =  pst.executeQuery();
			System.out.println("result set data : "+rs);
			if(rs.next()) {
				u1 = new weddingplanner();
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
	public static List<weddingplanner> getAllWeddingPlanners(){
		List<weddingplanner> list = new ArrayList<weddingplanner>();
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from weddingplanner";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				weddingplanner u1 = new weddingplanner();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setContact(rs.getLong("contact"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
				list.add(u1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}