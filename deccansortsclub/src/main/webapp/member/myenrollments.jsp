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
<h6>my enrollments</h6>
  <table border="1">
		<tr>
			<th>EnrollmentId</th>
			<th>BatchId</th>
			<th>StartDate</th>
			<th>EndDate</th>
			<th>Status</th>
		</tr>
		<c:forEach var="en" items="${enrollments}">
			<tr>
				<!-- user.getUsername(); user.getUserrole() -->
				<td><c:out value="${en.enrollId}"></c:out></td>
				<td><c:out value="${en.batchId}"></c:out></td>
				<td><c:out value="${en.startDate}"></c:out></td>
				<td><c:out value="${en.endDate}"></c:out></td>
				<td><c:out value="${en.mStatus}"></c:out></td>
				<td><a href="<%=request.getContextPath()%>/member/seebatches.jsp">RENEW</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>