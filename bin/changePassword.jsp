<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>

	<form action="changePassword.do" method="post">
	
	<label>Old Password</label>
	<input type="password" size=20 name="oldPassword">
	<br><br>
	
	<label>New Password</label>
	<input type="password" size=20 name="newPassword">
	<br><br>
	
	<label>confirm new Password</label>
	<input type="password" size=20 name="confirmNewPassword">
	<br><br>
	
	<input type="submit" value="GO">
	
	</form>

</body>
</html>
