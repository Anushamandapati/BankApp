<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@ include file="header.jsp" %>  

	<form action="login.do" method="post">
	
		<label>Customer Id: </label>
		<input type="text" size="15" name = "customerId" required>
		<br><br>
		
		<label>Password: </label>
		<input type="password" size="15" name = "password" required>
		<br><br>
	
	
			<input type="submit" value="Log In">
		
	
	</form>
</body>
</html>