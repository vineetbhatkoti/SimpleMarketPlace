<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/SimpleMarketPlaceClient/Stylesheet/style1.css">
<title>Login</title>
<style type="text/css">
body{
	text-align: center;
}
</style>
</head>
<body>
</br></br></br></br>
<center>
<div><h2> MarketPlace</h2></div></br>
<c:if test="${!empty message}">
<%= session.getAttribute( "message" ) %>
</c:if>

</br></br>


<form id="form1" method="post" action="SignIn" >  
      <div class="form-row"><span class="label">UserName :</span><input type="text" name="userName" /></div>  
      <div class="form-row"><span class="label">PassWord : </span><input type="password" name="password" /></div> 
      <div class="form-row"><input class="submit" type="submit" value="SignIn"><a href="SignUp.jsp"><font color="#000000">SignUp</font></a></div> 
</form> 
</center>
</body>
</html>