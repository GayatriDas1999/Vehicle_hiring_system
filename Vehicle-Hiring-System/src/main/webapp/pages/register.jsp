<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Page</title>
<link href="css/basic.css" rel="stylesheet">
</head>


<body style="background-image: url('../images/hector.jpg');">
	<div id="topheader">
		<span id="heading"><center>VEHICLE HIRING SYSTEM</center></span>
		<div align="center">

			<marquee width="350px">Drive Like its your Own!!!!!!!!!</marquee>

		</div>
	</div>
	<div class="topnav">

		<a class="active" href="#">Register</a> <a href="login">Login</a> <a
			href="homepage">HomePage</a>
	</div>

	<center>
		<h2>Register</h2>
	</center>

	<div align="center">
		<form:form action="/register_customer" method="POST"
			modelAttribute="customerDetails">
			<form:hidden path="customer_id" />
			<font color=white><b>Name </b></font>
			<form:input align="middle" path="name" required="required" />
			<br>
			<br>
			<font color=white><b>Address</b> <form:textarea rows="2"
					cols="30" align="middle" path="address" required="required" /><br></font>
			<br>

			<font color=white><b>Email </b> <form:input align="middle"
					path="email" required="required" /><br></font>
			<br>

			<font color=white><b>Contact No.</b> <form:input
					align="middle" path="contact_no" required="required" /><br></font>
			<br>

			<font color=white><b>Password </b> <form:password
					align="middle" path="password" required="required" /><br></font>
			<br>
			<button  class = "submitbutton" type="submit">Register</button>
		</form:form>
		<br> <br>

	</div>

</body>
</html>