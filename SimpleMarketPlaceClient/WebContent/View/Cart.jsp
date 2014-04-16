<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$('.button').click(function(){
				 var a= $(this).attr('id');
				 $(this).closest('tr').remove();
				
		        $.ajax({
		            type : 'POST',
		            url : 'AddToCart',
		            data : "action=removeItemFrmCart&cartId=" + a,
		            success : function(data) {
		            	
		            	alert("the call happened !!"+data);
		            },
		            error : function(data) {
		                setError('Make call failed');
		            }
		        });
		        return false;
		    });
		});
	
</script>
<link rel="stylesheet" type="text/css" href="/SimpleMarketPlaceClient/Stylesheet/style1.css">
</head>
<body>
</br>
<div align="center"><h2> MarketPlace</h2></div>
</br>
<div>
<form id="logout" action="Logout" method="post">
<input type="submit" name="logout" value="Logout" style="position: fixed; top: 53px; left: 1101px;"/>
</form></div>
<div align="left">
 Cart for <%= session.getAttribute( "userName" ) %>  !!
 </div>

 <div align="center">
<form id='form1' method="get" action="Payment">
<table border="1" id="table"> 
		<tr>
			<th>Cart Id</th>  
			<th>Advertisement Id</th>  
			<th>Quantity Ordered</th>  
			<th>Total Price </th>  
			<th>Action </th>
			
		</tr> 
		<c:forEach var="cart" items="${retrieveCart}">  
			<tr>
			<td>${cart.cartId}</td>  
			<td>${cart.advertisementId}</td>  
			<td>${cart.quantityOrdered}</td>  
			<td>${cart.totalPrice}</td>  
			<td><input type="button"  id="${cart.cartId}" class="button" value="Remove"></td>
			</tr>  
		</c:forEach>  
	</table>
	<input type="submit" id="checkout" value="Proceed to CheckOut"	onclick="submit()">
	</form></div>
</body>
</html>