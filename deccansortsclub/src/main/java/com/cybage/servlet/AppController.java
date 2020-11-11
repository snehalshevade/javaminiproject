package com.cybage.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"admin", "manager", "member"}
				)
		)
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.isUserInRole("admin")) {
			request.getRequestDispatcher("/admin/admin-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("manager")) {
			request.getRequestDispatcher("/manager/manager-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("member")) {
			request.getRequestDispatcher("/member/member-home.jsp").forward(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
