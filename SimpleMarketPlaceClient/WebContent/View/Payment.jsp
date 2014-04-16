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
<center>
			<h2>Payment</h2>
		</center>
		
<c:if test="${message != null}">
<%= session.getAttribute( "message" ) %>
</c:if>
</br></br></br>
<div align="center">
<form method="post" action="Payment">
				<table>
					<tr>
						<a href="#"><img title="card_logo"
							src="http://www.free-credit-card-logos.com/mc_ms_vs_accpt_h_023_gif.gif"
							width="113" height="23" border="0" /></a>
						</br>
					</tr>
					<tr>
						<td><label>Name Of Card Holder:</label></td>
						<td><input type="text" name="cardHolderName" /></td>
					</tr>
					<tr>
						<td><label>Card Number :</label></td>
						<td><input type="text" name="cardNumber"></td>
					</tr>
					<tr>
						<td><label>CVV :</label></td>
						<td><input type="text" name="cvv"></td>
					</tr>
					<tr>
						<td><label>Expiry Date :</label>
						<td><SELECT NAME="CCExpiresMonth">
								<OPTION VALUE="" SELECTED>--Month--
								<OPTION VALUE="01">January (01)
								<OPTION VALUE="02">February (02)
								<OPTION VALUE="03">March (03)
								<OPTION VALUE="04">April (04)
								<OPTION VALUE="05">May (05)
								<OPTION VALUE="06">June (06)
								<OPTION VALUE="07">July (07)
								<OPTION VALUE="08">August (08)
								<OPTION VALUE="09">September (09)
								<OPTION VALUE="10">October (10)
								<OPTION VALUE="11">November (11)
								<OPTION VALUE="12">December (12)
						</SELECT> / <SELECT NAME="CCExpiresYear">
								<OPTION VALUE="" SELECTED>--Year--
								<OPTION VALUE="14">2014
								<OPTION VALUE="15">2015
								<OPTION VALUE="16">2016
								<OPTION VALUE="17">2017
						</SELECT></td>
					</tr>



				</table>
				<input type="submit" value="Submit">

			</form></div>

</body>
</html>