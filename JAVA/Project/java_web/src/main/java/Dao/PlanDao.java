package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db_connection.dbconnection;
import Model.Customer;
import Model.Plan;

public class PlanDao {
	public static void addPlan(Plan p) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "insert into plan(wp_id,budget,style,noofguest,vanue,photosvideos,noofguestfortransport) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getWp_id());
			pst.setString(2, p.getBudget());
			pst.setString(3,p.getStyle());
			pst.setInt(4,p.getNoofguest());
			pst.setString(5, p.getVanue());
			pst.setString(6, p.getPhotosvideos());
			pst.setString(7, p.getNoofguestfortransport());
			pst.executeUpdate();
			System.out.println("plan added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Plan> getPlanByWPId(int id) {
		List<Plan> list= new ArrayList<Plan>();
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from plan where wp_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Plan p = new Plan();
				p.setPid(rs.getInt("pid"));
				p.setWp_id(rs.getInt("wp_id"));
				p.setBudget(rs.getString("budget"));
				p.setStyle(rs.getString("style"));
				p.setNoofguest(rs.getInt("noofguest"));
				p.setVanue(rs.getString("vanue"));
				p.setPhotosvideos(rs.getString("photosvideos"));
				p.setNoofguestfortransport(rs.getString("noofguestfortransport"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Plan getPlanByPId(int pid) {
		Plan p  = null;
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from plan where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				p = new Plan();
				p.setPid(rs.getInt("pid"));
				p.setWp_id(rs.getInt("wp_id"));
				p.setBudget(rs.getString("budget"));
				p.setStyle(rs.getString("style"));
				p.setNoofguest(rs.getInt("noofguest"));
				p.setVanue(rs.getString("vanue"));
				p.setPhotosvideos(rs.getString("photosvideos"));
				p.setNoofguestfortransport(rs.getString("noofguestfortransport"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static void deletePlan(int pid) {
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "delete from plan where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
			System.out.println("plan deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Plan> getAllPlan() {
		List<Plan> list= new ArrayList<Plan>();
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from plan";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Plan p = new Plan();
				p.setPid(rs.getInt("pid"));
				p.setWp_id(rs.getInt("wp_id"));
				p.setBudget(rs.getString("budget"));
				p.setStyle(rs.getString("style"));
				p.setNoofguest(rs.getInt("noofguest"));
				p.setVanue(rs.getString("vanue"));
				p.setPhotosvideos(rs.getString("photosvideos"));
				p.setNoofguestfortransport(rs.getString("noofguestfortransport"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<Plan> getAllPlans(){
		List<Plan> list123 = new ArrayList<Plan>();
		try {
			Connection conn = dbconnection.createConnection();
			String sql = "select * from plan";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Plan p = new Plan();
				p.setPid(rs.getInt("pid"));
				p.setWp_id(rs.getInt("wp_id"));
				p.setBudget(rs.getString("budget"));
				p.setStyle(rs.getString("style"));
				p.setNoofguest(rs.getInt("noofguest"));
				p.setVanue(rs.getString("vanue"));
				p.setPhotosvideos(rs.getString("photosvideos"));
				p.setNoofguestfortransport(rs.getString("noofguestfortransport"));
				list123.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list123;
	  }
	}