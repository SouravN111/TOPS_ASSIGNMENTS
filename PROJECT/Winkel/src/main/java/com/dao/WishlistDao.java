package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.ProjectUtil;

public class WishlistDao {

	public static void addToWishlist(Wishlist w) {
			try {
				Connection conn = ProjectUtil.createConnection();
				String sql = "INSERT INTO wishlist(uid, pid) VALUES(?, ?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, w.getUid());
				pst.setInt(2, w.getPid());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static List<Wishlist> getWishlistByUser(int uid) {
		
		List<Wishlist> list = new ArrayList<Wishlist>();
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "SELECT * FROM wishlist WHERE uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Wishlist w = new Wishlist();
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				w.setWid(rs.getInt("wid"));
				list.add(w);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static boolean checkWishlist(int uid, int pid) {
		boolean flag = false;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "SELECT * FROM wishlist WHERE uid=? AND pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void removeFromWishlist(Wishlist w) {
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "DELETE FROM wishlist WHERE uid=? AND pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getUid());
			pst.setInt(2, w.getPid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
