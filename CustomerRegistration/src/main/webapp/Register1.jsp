<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Customer Registration Form</h1>
<form action="Customer_Register" method="post">
 <table style="with: 80%">
<tr>
					<td> Name</td>
					<td><input type="text" name="Name" /></td>
					</tr>
					
					<tr>
					<td>CustomerId</td>
					<td><input type="text" name="CustomerID" /></td>
				</tr>
				
				
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				
				
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				</table>
				<input type="submit" value="Submit" />
				</form>
</body>
</html>