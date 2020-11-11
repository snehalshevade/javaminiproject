package com.cybage.services;

import java.sql.SQLException;
import java.util.List;

import com.cybage.pojos.Batch;
import com.cybage.pojos.BatchInfo;
import com.cybage.pojos.Enrollment;
import com.cybage.pojos.Plans;
import com.cybage.pojos.Sports;
import com.cybage.pojos.Users;

public interface CustomerServiceI {
	public void adduser(String username,String password,String address,
			   String phone,String email) throws SQLException, Exception;
	public List<Sports> getSports() throws SQLException, Exception;
	public List<Plans> getplans() throws SQLException, Exception;
	public List<BatchInfo> getbatches() throws SQLException, Exception;
	public List<BatchInfo> getbatchesbyId(int planId)throws SQLException, Exception;
	public Users getuser(String userName)throws SQLException, Exception;
	public boolean update(String userName, String address, String password, String phone, String email)
			throws SQLException, Exception;
	public void enrolluser(int batchId, String userName)throws SQLException, Exception;
	public List<Enrollment> getenrollments()throws SQLException, Exception;
}
