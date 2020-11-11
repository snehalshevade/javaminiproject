package com.cybage.dao;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cybage.dbutil.DbUtil;
import com.cybage.pojos.Batch;
import com.cybage.pojos.BatchInfo;
import com.cybage.pojos.Enrollment;
import com.cybage.pojos.Plans;
import com.cybage.pojos.Sports;
import com.cybage.pojos.Users;

public class CustomerDaoImpl implements CustomerDao {
	public static final Logger logger = LogManager.getLogger(CustomerDaoImpl.class.getName());

	@Override
	public void adduser(String username, String password, String address, String phone, String email)
			throws SQLException, Exception {
		String sql = "insert into users(userName,password,role,address,phone,email)values(?,?,?,?,?,?)";
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, "member");
		ps.setString(4, address);
		ps.setString(5, phone);
		ps.setString(6, email);
		if (ps.executeUpdate() == 1) {
			System.out.println("record added");
		} else {
			System.out.println("not added");
		}
		logger.info("Registration successful of user named as a:" + username);
	}

	@Override
	public List<Sports> getsports() throws Exception {
		String sql = "select * from sports";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Sports> sportlist = new ArrayList<Sports>();
		while (rs.next()) {
			sportlist.add(new Sports(rs.getInt(1), rs.getString(2)));
		}
		return sportlist;
		
	}

	@Override
	public List<Plans> getplans() throws SQLException, Exception {
		String sql = "select * from plans";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Plans> planslist = new ArrayList<Plans>();
		while (rs.next()) {
			planslist.add(new Plans(rs.getInt(1),rs.getString(2), rs.getDouble(3), rs.getInt(4)));
		}
		return planslist;
	}
	
	@Override
	public List<BatchInfo> getbatches() throws SQLException, Exception {
		String sql = "SELECT batch.batchId, batch.startDate,batch.endDate,batch.batchSize,sports.sportName\r\n"
				+ "FROM batch\r\n"
				+ "INNER JOIN sports ON batch.sportId=sports.sportId;";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<BatchInfo> batcheslist = new ArrayList<BatchInfo>();
		while (rs.next()) {
			batcheslist.add(new BatchInfo(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4),rs.getString(5)));
		}
		return batcheslist;
	}

	@Override
	public List<BatchInfo> getbatchesbyId(int planId) throws SQLException, Exception {
		String sql = "SELECT batch.batchId, batch.startDate,batch.endDate,batch.batchSize,sports.sportName\r\n"
				+ "FROM batch\r\n"
				+ "INNER JOIN sports ON batch.sportId=sports.sportId where planId= ? ";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, planId);
		ResultSet rs = ps.executeQuery();

		List<BatchInfo> batcheslist = new ArrayList<BatchInfo>();
		while (rs.next()) {
			batcheslist.add(new BatchInfo(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4),rs.getString(5)));
		}
		return batcheslist;
	}

	@Override
	public Users getuser(String userName) throws SQLException, Exception {
		String sql = "select * from users where userName = ? ";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, userName);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Users user = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7));
			return user;
		}
		return null;

	}

	@Override
	public boolean updateuser(String userName, String address, String password, String phone, String email)
			throws SQLException, Exception {
		String sql = "update users set username= ? ,address=?, password = ?,phone = ?,email = ? where username= ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, address);
		ps.setString(3, password);
		ps.setString(4, phone);
		ps.setString(5, email);
		ps.setString(6, userName);
		if (ps.executeUpdate() == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void enrolluser(int batchId, String userName) throws SQLException, Exception {
		System.out.println("dao::enroll user");
		System.out.println("dao::username::" + userName);
        LocalDate startdate = null;Date enddate=null;
		String sql = "select * from batch where batchId= ?";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, batchId);
		ResultSet rs = ps.executeQuery();
		System.out.println("batch selected...");
		System.out.println("rs:"+rs);
		if(rs.next()) {
			startdate=rs.getDate(2).toLocalDate();
			System.out.println("startdate:"+startdate);
		 enddate=rs.getDate(3);
		}
		String status = "PENDING";
		
	    String sql1 = "insert into enrollment(batchId,startDate,endDate,mStatus,userName)values(?,?,?,?,?)";
		PreparedStatement ps1 = connection.prepareStatement(sql1);
		ps1.setInt(1, batchId);
		ps1.setDate(2, LocalDate.parse("startdate"));
		ps1.setDate(3, enddate);
		ps1.setString(4, status);
		ps1.setString(5, userName);
		System.out.println(userName);
		if (ps1.executeUpdate() == 1) {
			System.out.println("record added in enrollment");
		} else {
			System.out.println("record not added in enrollment");
		}
	}

	@Override
	public List<Enrollment> getenrollments() throws SQLException, Exception {
		String sql = "select * from enrollment";
		Connection connection = DbUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
      	List<Enrollment> enlist = new ArrayList<Enrollment>();
		while (rs.next()) {
			enlist.add(new Enrollment(rs.getInt(1),rs.getInt(2),rs.getDate(3), rs.getDate(4),
					rs.getString(5), rs.getString(6)));
		}
		return enlist;
	}
}
