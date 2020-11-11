package com.cybage.dao;

import java.util.List;

import com.cybage.pojos.Users;

public interface AdminDaoI {

	public String getRole(String username) throws Exception;
	public List<Users> getAllManagers() throws Exception;
}
