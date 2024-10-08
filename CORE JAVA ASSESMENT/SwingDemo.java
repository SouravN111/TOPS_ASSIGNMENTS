package com.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo implements ActionListener {
	
	JFrame f;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3, b4;
	
	SwingDemo(){
		f= new JFrame("My Swing Demo");
		f.setVisible(true);
		f.setSize(370, 450);
		f.setResizable(false);
		f.setLayout(new FlowLayout());
		f.setLayout(null);
		
		l1 = new JLabel("ID");
		l2 = new JLabel("FIRST NAME");
		l3 = new JLabel("LAST NAME");
		l4 = new JLabel("EMAIL");
		l5 = new JLabel("MOBILE");
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		b1 = new JButton("INSERT");
		b2 = new JButton("SEARCH");
		b3 = new JButton("UPDATE");
		b4 = new JButton("DELETE");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.setBounds(50, 300, 100, 20);
		b2.setBounds(200, 300, 100, 20);
		b3.setBounds(50, 350, 100, 20);
		b4.setBounds(200, 350, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}
	
	
	public static void main(String[] args) {
		new SwingDemo();
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			if(t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "ALl fields are mandatory");
			}
			else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_practice", "root", "");
					String sql = "INSERT INTO student(fname, lname, email, mobile) VALUES(?, ?, ?, ?)";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setString(1, t2.getText());
					pst.setString(2, t3.getText());
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(f, "Data inserted successfully"); 
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b2) {
			if(t1.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "Id is mandatory");
			}
			else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_practice", "root", "");
					String sql = "SELECT * FROM student WHERE id=?";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t1.getText()));
					ResultSet rs =  pst.executeQuery();
					if(rs.next()) {
						t2.setText(rs.getString("fname"));
						t3.setText(rs.getString("lname"));
						t4.setText(rs.getString("email"));
						t5.setText(rs.getString("mobile"));
					}
					else {
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						JOptionPane.showMessageDialog(f, "Id not found"); 
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b3) {
			if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "All fields are mandatory");
			}
			else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_practice", "root", "");
					String sql = "UPDATE student SET fname=?, lname=?, email=?, mobile=? WHERE id=?";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setString(1, t2.getText());
					pst.setString(2, t3.getText());
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.setInt(5, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Data updated successfully"); 
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b4) {
			if(t1.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "Id is mandatory");
			}
			else {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_practice", "root", "");
					String sql = "DELETE FROM student WHERE id=?";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Data deleted successfully"); 
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}
}
