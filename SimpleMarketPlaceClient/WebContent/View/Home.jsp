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

Welcome to MarketPlace : 

<%= session.getAttribute( "userName" ) %> !!
</br>
Last Login Date: <%= session.getAttribute( "lastLogin" ) %>
</br></br>
<c:if test="${message != null}">
Message: <%= session.getAttribute( "message" ) %>
</c:if>
<div>
<form id="logout" action="Logout" method="post">
<input type="submit" name="logout" value="Logout" style="position: fixed; top: 53px; left: 1101px;"/>
</form></div>
</br></br></br></br>
<div align="center">
<h3> Click button to perform action</h3>
<form id="homeActions" action="AdOperation" method="GET">
		<input type="submit" name="showAds" value="ShowAds"/>
		<input type="submit" name="postAd" value="PostAd"/>	
	</form>
	</div>
	
</body>
</html>