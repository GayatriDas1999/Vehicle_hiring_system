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

<body style="background-image: url('../images/steering.jpg');">
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
					<h1 style="color: white">
						<u>CHOOSE YOUR VEHICLE TYPE</u>
					</h1>


				</center> </b> <font color=white>
				<div style="overflow-y: auto;">
					<table style="border: 3px solid white">
						<tr>
							<th>Vehicle_Name</th>
							<th>Type</th>
							<th>License No</th>
							<th>Fare(Rs/Km)</th>
							<th>Status</th>
							<th colspan="2">ACTION</th>
							
						</tr>
						<c:forEach var="vehicle" items="${vehicleList}">
							<tr>
								<td><c:out value="${vehicle.vehicle_name}"></c:out></td>
								<td><c:out value="${vehicle.type}"></c:out></td>
								<td><c:out value="${vehicle.license_no}"></c:out></td>
								<td><c:out value="${vehicle.fare}"></c:out></td>
								<td><c:out value="${vehicle.status}"></c:out></td>
								<td><spring:url
										value="/update_vehicle/${vehicle.license_no}" var="updateURL" /><b><a
										href="${updateURL}">UPDATE</a></b></td>
								<td><spring:url
										value="/delete_vehicle/${vehicle.license_no}" var="deleteURL" /><b><a
										href="${deleteURL}">DELETE</a></b></td>

							</tr>
						</c:forEach>
					</table>
				</div>
			</font>
	</div>
</body>
</html>