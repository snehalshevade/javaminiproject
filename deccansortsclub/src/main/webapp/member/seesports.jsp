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
<table border="1">
		<tr>
			<th>sportId</th>
			<th>sportName</th>
		</tr>
		<c:forEach var="sport" items="${sports}">
			<tr>
				<!-- user.getUsername(); user.getUserrole() -->
				<td><c:out value="${sport.sportId}"></c:out></td>
				<td><c:out value="${sport.sportName}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>