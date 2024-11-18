package Assesment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class DataNotFound {
    JLabel l1;

    public DataNotFound() {
        JFrame fr = new JFrame("Alert");
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setSize(300, 200);

        l1 = new JLabel("data not found");
        l1.setBounds(50, 50, 120, 20);
        fr.add(l1);
    }
}

class SwingAsses1 implements ActionListener {
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3, t4, t5, t6;  
    JLabel l1, l2, l3, l4, l5, l6;

    public SwingAsses1() {
        JFrame fr = new JFrame("My Swing Example");
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setSize(700, 500);

        l1 = new JLabel("ID : ");
        l1.setBounds(100, 100, 120, 20);
        fr.add(l1);

        l2 = new JLabel("First Name : ");
        l2.setBounds(100, 130, 120, 20);
        fr.add(l2);

        l3 = new JLabel("Last Name : ");
        l3.setBounds(100, 160, 120, 20);
        fr.add(l3);

        l4 = new JLabel("Contact : ");
        l4.setBounds(100, 190, 120, 20);
        fr.add(l4);

        l5 = new JLabel("Email : ");
        l5.setBounds(100, 220, 120, 20);
        fr.add(l5);

        t1 = new JTextField();
        t1.setBounds(180, 100, 120, 20);
        fr.add(t1);

        t2 = new JTextField();
        t2.setBounds(180, 130, 120, 20);
        fr.add(t2);

        t3 = new JTextField();
        t3.setBounds(180, 160, 120, 20);
        fr.add(t3);

        t4 = new JTextField();
        t4.setBounds(180, 190, 120, 20);
        fr.add(t4);

        t5 = new JTextField();
        t5.setBounds(180, 220, 120, 20);
        fr.add(t5);

        b1 = new JButton("Insert");
        b1.setBounds(100, 260, 120, 20);
        fr.add(b1);

        b2 = new JButton("Search");
        b2.setBounds(250, 260, 120, 20);
        fr.add(b2);

        b3 = new JButton("Update");
        b3.setBounds(100, 290, 120, 20);
        fr.add(b3);

        b4 = new JButton("Delete");
        b4.setBounds(250, 290, 120, 20);
        fr.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public static Connection createConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingasses", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void actionPerformed(ActionEvent e) {
        // Insert button 
        if (e.getSource() == b1) {
            System.out.println("Insert button clicked");
            int id = Integer.parseInt(t1.getText());
            String firstName = t2.getText();
            String lastName = t3.getText();
            long contact = Long.parseLong(t4.getText());
            String email = t5.getText();
            System.out.println(id + firstName + lastName + contact + email);

            try {
                Connection conn = SwingAsses1.createConnection();
                String sql = "insert into  userdata(id, first_name, last_name, contact, email) VALUES(?, ?, ?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                pst.setString(2, firstName);
                pst.setString(3, lastName);
                pst.setLong(4, contact);
                pst.setString(5, email);
                pst.executeUpdate();
                System.out.println("Data inserted");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        // Search button 
        else if (e.getSource() == b2) {
            System.out.println("Search button clicked");
            int id = Integer.parseInt(t1.getText());
            try {
                Connection conn = SwingAsses1.createConnection();
                String sql = "SELECT * FROM userdata WHERE id=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    t1.setText(String.valueOf(rs.getInt("id")));
                    t2.setText(rs.getString("first_name"));
                    t3.setText(rs.getString("last_name"));
                    t4.setText(String.valueOf(rs.getLong("contact")));
                    t5.setText(rs.getString("email"));
                } else {
                    System.out.println("Data not found");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    new DataNotFound();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        // Update button
        else if (e.getSource() == b3) {
            System.out.println("Update button clicked");
            int id = Integer.parseInt(t1.getText());
            String firstName = t2.getText();
            String lastName = t3.getText();
            long contact = Long.parseLong(t4.getText());
            String email = t5.getText();

            try {
                Connection conn = SwingAsses1.createConnection();
                String sql = "update userdata set first_name=?, last_name=?, contact=?, email=? WHERE id=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setLong(3, contact);
                pst.setString(4, email);
                pst.setInt(5, id);
                pst.executeUpdate();
                System.out.println("Data updated");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        // Delete button 
        else if (e.getSource() == b4) {
            System.out.println("Delete button clicked");
            int id = Integer.parseInt(t1.getText());
            try {
                Connection conn = SwingAsses1.createConnection();
                String sql = " userdata WHERE id=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, id);
                pst.executeUpdate();
                System.out.println("Data deleted");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

public class SwingAssesment1 {
    public static void main(String[] args) {
        new SwingAsses1();
    }
}
