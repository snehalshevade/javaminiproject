package com.cybage.services;

import com.cybage.dao.AdminDaoI;
import com.cybage.dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminServiceI {
	AdminDaoI adminDaoObj=new AdminDaoImpl();
	
	@Override
	public String showRole(String username) throws Exception {
		return adminDaoObj.getRole(username);
	}

}
