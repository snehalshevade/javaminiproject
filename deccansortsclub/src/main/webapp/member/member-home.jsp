<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h6>welcome
	 <%=request.getRemoteUser() %></h6>
	<%HttpSession session1=request.getSession();
	session1.setAttribute("username",request.getRemoteUser());%>
	<a href="<%=request.getContextPath()%>/CustomerServlet/listsports">see
		sports</a>
	<a href="<%=request.getContextPath()%>/CustomerServlet/listplans">see
		plans</a>
	<a href="<%=request.getContextPath()%>/CustomerServlet/listbatches">see
		batches</a>
		<a href="<%=request.getContextPath()%>/CustomerServlet/viewenrollments">My Enrollments</a>
    <a href="<%=request.getContextPath()%>/CustomerServlet/viewprofile">View Profile</a>
	<a href="<%=request.getContextPath()%>/logout.jsp">Logout</a>
	
</body>
</html>