<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is login page.

	<table>
		<form action="/auth/login.html" method= "post">
			<tr>
				<td>UserName</td>
				<td><input type = "text" name ="userName"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type = "text" name ="password"/></td>
			</tr>
			<tr>
				<td><input type = "submit"/></td>
			</tr>
		</form>
	</table>
</body>
</html>