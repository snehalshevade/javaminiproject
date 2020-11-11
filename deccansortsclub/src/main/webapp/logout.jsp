<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color:green">
		User '<%=request.getRemoteUser()%>' has been logged out.
	</h2>
	<%
		session.invalidate();
	%>
	<jsp:include page="index.jsp"></jsp:include>
	<br />
	<br />
</body>
</html>