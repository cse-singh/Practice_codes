<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>welcome  to the world of Java books......</title>
		<link rel="stylesheet" type="text/css" href="mystyle.css">
	</head>
<body>
	<c:set var="message" value="Welcome to JSTL!" scope="session" />
	<h2 align="center"><c:out value="${message}"/></h2>
	<form action="details.jsp" method="post">
	<table align="center">
<tr><td colspan=2 align="center"><h4>welcome to the world of Java books</h4></td></tr>
	<tr><td>A place where you can get information on Java books</td></tr>
	<tr><td> select audience level <select name="level">
		<option>Beginner</option>
		<option>Intermediate</option>
		<option>Advance</option>
	</select>	
	</td></tr>
	<tr><td colspan="2"><input type="submit" value="Submit"></td></tr>
	</table> 
</form>
</body>
</html>
