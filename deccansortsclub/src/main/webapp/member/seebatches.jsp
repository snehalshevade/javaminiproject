<%@page import="com.cybage.pojos.Batch"%>
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
${msg}
    <table border="1">
		<tr>
			<th>BatchId</th>
			<th>startdate</th>
			<th>enddate</th>
			<th>batch size</th>
			<th>sportName</th>
		</tr>
		<c:forEach var="batch" items="${batches}">
			<tr>
				<!-- user.getUsername(); user.getUserrole() -->
				<td><c:out value="${batch.batchId}"></c:out></td>
				<td><c:out value="${batch.startDate}"></c:out></td>
				<td><c:out value="${batch.endDate}"></c:out></td>
				<td><c:out value="${batch.batchSize}"></c:out></td>
				<td><c:out value="${batch.sportName}"></c:out></td>
				<td><a href="<%=request.getContextPath()%>/CustomerServlet/enrolluser?batchId=${batch.batchId}">Enroll</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>