<<<<<<< HEAD
package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db_connection.dbconnection;
import Model.Product;

public class ProductDao {

    public static void addProduct(Product p) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "INSERT INTO product (name, category, model, price, description) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getCategory());
            pst.setString(3, p.getModel());
            pst.setDouble(4, p.getPrice());
            pst.setString(5, p.getDescription());
            
            pst.executeUpdate();
            System.out.println("Product added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "SELECT * FROM product";  
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                productList.add(product);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static Product getProductById(int productId) {
        Product product = null;
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "SELECT * FROM product WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, productId);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
    public static void deleteProduct(int productId) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "DELETE FROM product WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, productId);
            pst.executeUpdate();
            System.out.println("Product deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateProduct(Product p) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "UPDATE product SET name=?, category=?, model=?, price=?, description=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getCategory());
            pst.setString(3, p.getModel());
            pst.setDouble(4, p.getPrice());
            pst.setString(5, p.getDescription());
            pst.setInt(6, p.getId()); 
            pst.executeUpdate();
			System.out.println("data updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
=======
package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db_connection.dbconnection;
import Model.Product;

public class ProductDao {

    public static void addProduct(Product p) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "INSERT INTO product (name, category, model, price, description) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getCategory());
            pst.setString(3, p.getModel());
            pst.setDouble(4, p.getPrice());
            pst.setString(5, p.getDescription());
            
            pst.executeUpdate();
            System.out.println("Product added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "SELECT * FROM product";  
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                productList.add(product);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static Product getProductById(int productId) {
        Product product = null;
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "SELECT * FROM product WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, productId);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setModel(rs.getString("model"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
    public static void deleteProduct(int productId) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "DELETE FROM product WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, productId);
            pst.executeUpdate();
            System.out.println("Product deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateProduct(Product p) {
        try {
            Connection conn = dbconnection.createConnection();
            String sql = "UPDATE product SET name=?, category=?, model=?, price=?, description=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.getName());
            pst.setString(2, p.getCategory());
            pst.setString(3, p.getModel());
            pst.setDouble(4, p.getPrice());
            pst.setString(5, p.getDescription());
            pst.setInt(6, p.getId()); 
            pst.executeUpdate();
			System.out.println("data updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
}