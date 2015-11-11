<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="100%">
		<tr>
			<th>id</th>
			<th>username</th>
			<th>password</th>
			<th>email</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>address</th>
			<th>contactnumber</th>
			<th>createdby</th>
			<th>updatedby</th>
			<th>createdate</th>
			<th>updatedate</th>
			<th>role_id</th>
		</tr>
		<c:forEach var="User" items="${myData}">
			<tr>
				<td><c:out value="${User.id}" /></td>
				<td><c:out value="${User.username}" /></td>
				<td><c:out value="${User.password}" /></td>
				<td><c:out value="${User.email}" /></td>
				<td><c:out value="${User.firstname}" /></td>
				<td><c:out value="${User.lastname}" /></td>
				<td><c:out value="${User.address}" /></td>
				<td><c:out value="${User.contactnumber}" /></td>
				<td><c:out value="${User.createdby}" /></td>
				<td><c:out value="${User.updatedby}" /></td>
				<td><c:out value="${User.createdate}" /></td>
				<td><c:out value="${User.updatedate}" /></td>
				<td><c:out value="${User.role_roleid }" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="AdminUpdateFile.jsp">Update</a>
	<a href="AdminDeleteFile.jsp">Delete</a>


</body>
</html>