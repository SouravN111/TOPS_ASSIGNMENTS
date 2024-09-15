package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "INSERT INTO student(fname, lname, email, mobile, address, password) VALUES(?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setString(6, s.getPassword());
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "SELECT * FROM student WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "SELECT * FROM student";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
				s.setAddress(rs.getString("address"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Student getStudent(int id){
		Student s = null;
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "SELECT * FROM student WHERE id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
				s.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static void deleteStudent(int id) {
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "DELETE FROM student WHERE id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateStudent(Student s) {
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "UPDATE student SET fname = ?, lname = ?, email = ?, mobile = ?, address = ? WHERE id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setInt(6, s.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changePassword(String email, String password) {
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "UPDATE student SET password = ? WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, password);
			pst.setString(2, email);
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Student checkLogin(String email){
		Student s = null;
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "SELECT * FROM student WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
				s.setAddress(rs.getString("address"));
				s.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

}
