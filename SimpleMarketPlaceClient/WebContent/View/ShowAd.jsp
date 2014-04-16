<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/SimpleMarketPlaceClient/Stylesheet/style1.css">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$('a').click(function(event) {
				var id = $(this).attr('id');
				var quant="."+id
				var quantity=$(quant).val();
				alert(" The vale if id is :"+id);
				alert(" quantity ordered :"+(quantity));
				
				
				
				$.ajax({
					url : "AddToCart",
				    type: "POST",
				    data : "action=addToCart&quantityOrder="+quantity+"&ad_id=" + id,
				    success:function(data, textStatus, jqXHR){
				    	alert("Successfully added to cart..");
				    },
				    error: function(jqXHR, textStatus, errorThrown){
				    	alert("Could not add to cart.. " + errorThrown);
				    }
				});
			});
		});
	
</script>
</head>
<body>
</br>
<div align="center"><h2> MarketPlace</h2></div>
</br>
<div>
<form id="logout" action="Logout" method="post">
<input type="submit" name="logout" value="Logout" style="position: fixed; top: 53px; left: 1101px;"/>
</form></div>

<div align="center">
<form id='form1' method="get" action="AddToCart">
<table border="1" id="table"> 
		<tr>
			<th>Advertisement Id</th>  
			<th>Item Name</th>  
			<th>Item Description</th>  
			<th>Item Price</th>  
			<th>Item Quantity</th>  
			<th>Seller ID</th>
			<th>Quantity Ordered</th>  
			<th>Perform Action </th>  
			
		</tr> 
		<c:forEach var="ad" items="${ads}">  
			<tr>
			<td>${ad.advertisementId}</td>  
			<td>${ad.itemName}</td>  
			<td>${ad.itemDescription}</td>  
			<td>${ad.itemPrice}</td>  
			<td>${ad.quantity}</td>  
			<td>${ad.userName}</td>  
			<td><input type="text" class="${ad.advertisementId}" id="quantityOrd" ></td>
			<td><a id='${ad.advertisementId}' href="#">Add to Cart</a>
			</tr>  
		</c:forEach>  
	</table>
	<input type="submit" id="checkout" value="Proceed to Cart"	onclick="submit()">
	</form></div>
</body>
</html>