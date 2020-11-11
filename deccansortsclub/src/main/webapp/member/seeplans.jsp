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
			<th>planName</th>
			<th>fees</th>
			<th>duration</th>
		</tr>
		<c:forEach var="plan" items="${plans}">
			<tr>
				<!-- user.getUsername(); user.getUserrole() -->
				<td><c:out value="${plan.planName}"></c:out></td>
				<td><c:out value="${plan.fees}"></c:out></td>
				<td><c:out value="${plan.duration}"></c:out></td>
				<td>
			<a href="<%=request.getContextPath()%>/CustomerServlet/listbatches1?planId=${plan.planId}">seebatches</a>
			</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>