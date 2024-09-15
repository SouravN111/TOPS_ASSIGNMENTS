<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>First Project</title> 
<style type="text/css">
	tr, td{
		padding: 10px;
	}
</style>
</head>
<body>
<b style="color: green;">
<%
	if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
	}
%>
</b>
	<form name="insert" method="post" action="StudentController">
		<table>
			
			
			<tr>
				<td>Old password</td>
				<td><input type="password" name="old_password"></td>
			</tr>
			
			<tr>
				<td>New password</td>
				<td><input type="password" name="new_password"></td>
			</tr>
			
			<tr>
				<td>Confirm new password</td>
				<td><input type="password" name="cnew_password"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="action" value="Change Password">
				</td>
			</tr>
		</table>
	</form>
	

</body>
</html>