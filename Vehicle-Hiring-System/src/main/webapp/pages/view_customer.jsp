<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Listing</title>
<style type="text/css">
table{
	border: 3px solid grey;
	table-layout:fixed; 
}
 td, th {
 border: 3px solid grey;
 word-wrap:break-word;
 }

a {
	color: white;
}
</style>
</head>
<link href="css/basic.css" rel="stylesheet">

<body style="background-image: url('../images/car.jpg');">
	<div id="topheader">
		<span id="heading"><center>VEHICLE HIRING SYSTEM</center></span>
		<div>
			<center>
				<marquee width="250px">Drive Like its your Own!!!!!!!!!</marquee>
			</center>
		</div>
	</div>
	<div class="topnav">

		<a class="active" href="login">LOGOUT</a> 
		<a href="homepage">HomePage</a>
		<a href="admin_menu">Menu</a>
	</div>
	<div align="center">

			<b><center>
					<h2 style="color: white">
						<u>CUSTOMER LIST</u>
					</h2>
					
					
				</center> </b> <font color=white>
				<div style="overflow-y: auto;">
				<table style="border: 3px solid white">
					<tr>
						<th>Customer ID</th>
						<th>Name
						<th>Address</th>
						<th>Contact</th>
						<th>Email</th>
					</tr>
					<c:forEach var="customer" items="${customerList}">
						<tr>
							<td><c:out value="${customer.customer_id}"></c:out></td>		
							<td><c:out value="${customer.name}"></c:out></td>
							<td><c:out value="${customer.address}"></c:out></td>
							<td><c:out value="${customer.contact_no}"></c:out></td>
							<td><c:out value="${customer.email}"></c:out></td>								
						</tr>
					</c:forEach>
				</table>
				</div>
			</font>
			<br>
			<br>
	</div>
</body>
</html>