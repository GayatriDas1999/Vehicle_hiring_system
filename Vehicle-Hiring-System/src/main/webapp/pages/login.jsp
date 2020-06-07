<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/basic.css" rel="stylesheet">

<body style="background-image: url('../images/hector.jpg');">
	<div id="topheader">
		<span id="heading"><center>VEHICLE HIRING SYSTEM</center></span>
		<div>
			<center>
				<marquee width="250px">Drive Like its your Own!!!!!!!!!</marquee>
			</center>
		</div>
	</div>
	<div class="topnav">

		<a class="active" href="#">Login</a> <a href="homepage">HomePage</a>
	</div>

	<div align="center">
		<h1>Login Form</h1>

		<form:form action="/login_validate" method="post" modelAttribute="customer">

			<font color=white><b>CustomerId </b>
			<form:input align="middle" name="name" required="required" path="name"/><br></font>
			<br>
			<font color=white><b>Password </b>
			<form:input type="password"
					align="middle" name="password" required="required" path="password"/><br></font>
			<br />
			<button  class = "submitbutton" type="submit">LOGIN</button>
			<br>
			<font color=white><b>New User?</b> <a style="color: white;"
				href="register">Click here to Register</a></font>

		</form:form>
		
		<b><span style="color: white;">${message}</span></b>

	</div>



</body>
</html>