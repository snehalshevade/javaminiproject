package com.cybage.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.services.AdminServiceI;
import com.cybage.services.AdminServiceImpl;

//@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	AdminServiceI adminServiceObj=new AdminServiceImpl();
    
	public AdminServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username="snehal";
		try {
			System.out.println(adminServiceObj.showRole(username));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
