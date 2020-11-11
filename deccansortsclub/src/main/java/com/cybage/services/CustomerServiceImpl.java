package com.cybage.services;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.CustomerDao;
import com.cybage.dao.CustomerDaoImpl;
import com.cybage.pojos.Batch;
import com.cybage.pojos.BatchInfo;
import com.cybage.pojos.Enrollment;
import com.cybage.pojos.Plans;
import com.cybage.pojos.Sports;
import com.cybage.pojos.Users;

public class CustomerServiceImpl implements CustomerServiceI{
	CustomerDao dao=new CustomerDaoImpl();
	public void adduser(String username,String password,String address,
			   String phone,String email) throws SQLException, Exception 
	{
	   dao.adduser(username, password, address, phone, email);
	}
	@Override
	public List<Sports> getSports() throws Exception {
		return dao.getsports();
	}
	@Override
	public List<Plans> getplans() throws SQLException, Exception {
		return dao.getplans();
	}
	@Override
	public List<BatchInfo> getbatches() throws SQLException, Exception {
		return dao.getbatches();
	}
	@Override
	public List<BatchInfo> getbatchesbyId(int planId) throws SQLException, Exception {
		return dao.getbatchesbyId(planId);
	}
	@Override
	public Users getuser(String userName) throws SQLException, Exception {
		return dao.getuser(userName);
	}
	@Override
	public boolean update(String userName, String address, String password, String phone, String email)
			throws SQLException, Exception {
		return dao.updateuser(userName,address,password,phone,email);
	}
	@Override
	public void enrolluser(int batchId, String userName) throws SQLException, Exception {
		System.out.println("service::enroll user");
		dao.enrolluser(batchId,userName);
		
	}
	@Override
	public List<Enrollment> getenrollments() throws SQLException, Exception {
		return dao.getenrollments();
	}
	

}
