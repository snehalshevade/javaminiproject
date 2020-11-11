<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Register</h1>
<form method="post"
		action="<%=request.getContextPath()%>/CustomerServlet/adduser">
Username:<input type="text" name="username">
<br>
Password:<input type="text" name="password">
<br>
Address:<input type="text" name="address">
<br>
Phone:<input type="text" name="phone">
<br>
Email:<input type="text" name="email">
<br>
<input type="submit" value="Register">
</form>
</body>
</html>