<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/basic.css" rel="stylesheet">

<body style="background-image: url('../images/steering.jpeg');">
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
	</div>


	<div align="center">
		<form:form action="/booking_vehicle" method="POST"
			modelAttribute="bookingDetails">
			<form:hidden path="booking_id" />
			<form:hidden path="customer_id" value="${customer.customer_id}"/>
			<form:hidden path="customer_name" value="${customer.name}"/>
			<form:hidden path="vehicle_name" value="${vehicle.vehicle_name}"/>
			<form:hidden path="total_fare"/>

			<br>
			<font color=white>Vehicle_id <form:input path="vehicle_id"
					value="${vehicle.license_no}" readonly="readonly" /><br></font>
			<br>
			<br>
			<font color=white>Fare </font>
			<form:input path="fare" required="required" value="${vehicle.fare}"
				readonly="readonly" />
			<br>
			<br>
			<br>
			<font color=white>PickUp-Location </font>
			<form:input path="pickup" required="required" />
			<br>
			<br>
			<br>
			<font color=white>Drop-Location </font>
			<form:input type="text" path="droploc" required="required"/>
			<br>
			<br>
			<br>
			<font color=white>Distance(in km) </font>
			<form:input path="distance" required="required"/>
			<br>
			<br />
			<button  class = "submitbutton" type="submit">Submit</button>

		</form:form>
	</div>


</body>
</html>