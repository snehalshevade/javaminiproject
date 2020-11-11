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
	<h1>Enroll</h1>
	<form method="post"
		action="<%=request.getContextPath()%>/CustomerServlet/enrolluser">
		BatchID: <input type="text" name="batchId" value="${batch.batchId}"
			readonly="readonly"> <br> startDate: <input
			type="text name=" startDate" value="${batch.startDate}"> <br>
		EndDate: <input type="text" name="endDate" value="${batch.endDate}">
		 <br>
		 <label for="sports">Choose a sport:</label> 
		 <select id="sports" name="sports">
			<option value="volvo">Volvo</option>
			<option value="saab">Saab</option>
		</select> <input type="submit" value="Enroll">
	</form>
</body>
</html>