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
	<h1>view profile page</h1>
	${msg} 
	<form method="post"
		action="<%=request.getContextPath()%>/CustomerServlet/updateuser">
		Username: <input type="text" name="username" value="${user.username}"
			readonly="readonly"> <br> Email: <input type="text"
			name="email" value="${user.email}" readonly="readonly"> <br> Address: <input
			type="text" name="address" value="${user.address}"> <br>
		Phone: <input type="text" name="phone" value="${user.phone}">
		<br> Role: <input type="text" name="userrole"
			value="${user.role}"> <br> Password: <input
			type="password" name="password" value="${user.password}"> <br>
		<input type="submit" value="Update User">
	</form>
</body>
</html>