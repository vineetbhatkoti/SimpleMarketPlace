<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/SimpleMarketPlaceClient/Stylesheet/style1.css">
<title>Insert title here</title>
</head>
<body>
<div align="center"><h2> MarketPlace</h2></div></br>
<div align="center"><h4> Please enter the following details for registering</h4></div></br></br></br>
<div id="signUp" align="center">
		<form name="signUp" method="Post" action="SignUp"  autocomplete="off">
			<table border="0" width="300px">
				<tr>
					<td><label>First Name </label></td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name</label></td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td><label>UserName</label></td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><label>Address</label></td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td><label>Phone</label></td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SignUp"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>

	</div>


</body>
</html>