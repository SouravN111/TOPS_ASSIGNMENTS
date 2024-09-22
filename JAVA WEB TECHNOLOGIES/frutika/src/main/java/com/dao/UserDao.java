package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;
import com.util.ProjectUtil;

public class UserDao {
	
	public static void signupUser(User u) {
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "INSERT INTO user(usertype, fname, lname, mobile, email, address, password) VALUES(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getUsertype());
			pst.setString(2, u.getFname());
			pst.setString(3, u.getLname());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getEmail());
			pst.setString(6, u.getAddress());
			pst.setString(7, u.getPassword());
			
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkMail(String email) {
		boolean flag = false;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "SELECT * FROM user WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag =  true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static User loginUser(String email) {
		User u = null;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "SELECT * FROM user WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setUsertype(rs.getString("usertype"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(Long.parseLong(rs.getString("mobile")));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

}
