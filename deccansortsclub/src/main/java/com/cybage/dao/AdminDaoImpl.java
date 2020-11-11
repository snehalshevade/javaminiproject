package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.cybage.dbutil.DbUtil;
import com.cybage.pojos.Users;

public class AdminDaoImpl implements AdminDaoI {

	@Override
	public String getRole(String username) throws Exception {
		String sql = "select role from users where username = ?";
		Connection con = DbUtil.getConnection();		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs= ps.executeQuery();
		if(rs.next()){
			
			return rs.getString(1);
		}
		else {
			
			throw new Exception("No matching role found");
		}
	}
	
	@Override
	public List<Users> getAllManagers() throws Exception {
		
		return null;
	}

	

}
