<%@page import="Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User u = (User) request.getAttribute("data");
	%>
	<form action="UserController" method="post">
		<table>
			<tr>
				<td>Id :</td>
				<td><input type="text" name="id" value="<%=u.getId()%>"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" value="<%=u.getName()%>"></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact"
					value="<%=u.getContact()%>"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"
					value="<%=u.getAddress()%>"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email" value="<%=u.getEmail()%>"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"
					value="<%=u.getPassword()%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>
