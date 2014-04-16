<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/SimpleMarketPlaceClient/Stylesheet/style1.css">
<title>Insert title here</title>
</head>
<body>
</br>
<div align="center"><h2> MarketPlace</h2></div>
</br>
<div align="center">
<form id="logout" action="Logout" method="post">
<input type="submit" name="logout" value="Logout" style="position: fixed; top: 53px; left: 1101px;"/>
</form></div>
<div align="center">
<h3>Enter Details To Post Advertisement</h3>
</br></br>

<c:if test="${message != null}">
<%= session.getAttribute( "message" ) %>
</c:if>
<form id='form1' method="post" action="AdOperation">
<table border="1" id="table"> 
		<tr>
			<th>Item_Name</th>  
			<th>Item_Description</th>  
			<th>Item_Price</th>  
			<th>Item_Quantity </th>  
		</tr> 
			<tr>
			<td><input type="text" name="itemName" id="itemName" ></td>  
			<td><input type="text" name="itemDescription" id="itemDescription" ></td>  
			<td><input type="text" name="itemPrice" id="itemPrice" ></td>  
			<td><input type="text" name="quantity" id="quantity" ></td>  
			
			</tr>  
	</table>
	<input type="submit" id="checkout" value="Submit"	onclick="submit()">
	</form></div>
</body>
</html>