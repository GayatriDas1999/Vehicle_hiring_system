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
table, th, td {
	border: 3px solid grey;
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

		<a class="active" href="login">LOGOUT</a> <a href="homepage">HomePage</a>
	</div>
	<div align="center">

			<b><center>
					<h2 style="color: white">
						<u>VIEW YOUR BOOKINGS</u>
					</h2>
					
					
				</center> </b> <font color=white>
				<div style="overflow-y: auto;">
				<table style="border: 3px solid white">
					<tr>
						<th>Customer_Name</th>
						<th>Distance
						<th>License No</th>
						<th>Vehicle Name</th>
						<th>Drop-Loc</th>
						<th>Pickup</th>
						<th>Total_Fare</th>
					</tr>
					<c:forEach var="booking" items="${bookingList}">
						<tr>
							<td><c:out value="${booking.customer_name}"></c:out></td>
							<td><c:out value="${booking.distance}"></c:out></td>
							<td><c:out value="${booking.vehicle_id}"></c:out></td>
							<td><c:out value="${booking.vehicle_name}"></c:out></td>
							<td><c:out value="${booking.droploc}"></c:out></td>
							<td><c:out value="${booking.pickup}"></c:out></td>
							<td><c:out value="${booking.total_fare}"></c:out></td>
							

						</tr>
					</c:forEach>
				</table>
				</div>
			</font>
			<br>
			<br>
			<a class="button"style="color: white;"
				href="vehicle_list">Click here to Book Again!!</a></font>
	</div>
</body>
</html>