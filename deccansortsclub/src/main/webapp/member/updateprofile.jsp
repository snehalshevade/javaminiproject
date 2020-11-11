<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
</head>
<body>
${sessionScope.msg} 
Updating user
	<form method="post"
	
		action="<%=request.getContextPath()%>/CustomerServlet/updateuser">
		Username: <input type="text" name="username" value="${user.username}" readonly="readonly"> <br>
		Password: <input type="password" name="password" value=""> <br>
		Address: <input type="text" name="address" value=""> <br>
		Phone: <input type="text" name="phone" value=""> <br>
		Email: <input type="text" name="email" value=""> <br>
		Role: <input type="text" name="userrole" value="${user.role}"> 
		<br> 
		<input type="submit" value="Update User">
	</form>
</body>
</html>