<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/basic.css" rel="stylesheet">
<center>
<body style="background-image: url('../images/steering.jpeg');"> 
<div id="topheader">
<span id="heading"><center>
VEHICLE HIRING SYSTEM</center></span>
<div><center><marquee width="250px">Drive Like its your Own!!!!!!!!!</marquee></center> </div>
</div>
<div class="topnav">
 
  <a class="active" href="login" >LOGOUT</a>
  <a href="homepage">HomePage</a>
</div>
</center>

<br>
<br>
<div align="center">
<fieldset>
<legend><b> <font color=white>BILLING INFO</font></b></legend>
<form:form method="post" action="/bill_vehicle" modelAttribute="billingDetails">

    <font color=white>BookingId :</font> <form:input path="booking_id" value ="${booking_id}" readonly="readonly"/><br><br>
	<font color=white>TotalAmt:</font> <form:input type="text" path="amount" value ="${amount}"  readonly="readonly"/><br><br>
	<button class = "submitbutton" type="submit" value="PAY">  PAY</button>
	
	</form:form>
</fieldset>
</div>
</body>
</html>
