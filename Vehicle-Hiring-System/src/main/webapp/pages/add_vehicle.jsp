<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERT VEHICLE</title>
<style type="text/css">.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: right;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}

body {
	font-size: 25px;
	padding-top: 0px; height : 700px;
	background-repeat: no-repeat;
	background-size: 100% 100%;
	height: 700px;
}

#topheader {
	text-decoration: none;
	font-size: 17px;
	background-color: #1DA497;
}

#heading {
	padding-top: 0px;
	font-size: 27px;
	font-style: inherit;
	font-family: Times New Roman, Times, serif;
}

.middle {
	width: 65%;
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
}

td, th {
	text-align: left;
	padding: 8px;
	border-collapse: collapse;
}

.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
}
.submitbutton {
  background-color: #A9A9A9	;
  border: none;
  color: black;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}</style>
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

		<a class="active" href="#">Menu</a> <a href="login">LOGOUT</a> <a
			href="homepage">HomePage</a>
	</div>

	<div align="center">
		<h2>ADD VEHICLE</h2>
	</div>

	<div align="center">
		<form:form action="/insert_vehicle" method="POST"
			modelAttribute="vehicleDetails">
			<form:hidden path="vehicle_id" />
			<font color=white><b>Vehicle Name </b></font>
			<form:input align="middle" path="vehicle_name" required="required" />
			<br>
			<br>
			<font color=white><b>Type</b> <form:input
			 align="middle" path="type" required="required" /><br></font>
			<br>

			<font color=white><b>License No </b> <form:input align="middle"
					path="license_no" required="required" /><br></font>
			<br>

			<font color=white><b>Status</b> <form:input
					align="middle" path="status" required="required" /><br></font>
			<br>

			<font color=white><b>Fare(Rs/Km) </b> <form:input
					align="middle" path="fare" required="required" value="10" /><br></font>
			<br>
			<button  class = "submitbutton" type="submit">ADD VEHICLE</button>
		</form:form>
		<br> <br>

	</div>

</body>
</html>