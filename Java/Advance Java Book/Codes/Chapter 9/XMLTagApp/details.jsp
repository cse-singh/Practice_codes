<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>    
		<title>My JSP 'details.jsp' starting page</title>
		<link rel="stylesheet" type="text/css" href="mystyle.css">
	</head>
<body>
	<c:import url="books.xml" var="book"/>
	<x:parse xml="${book}" var="parsed"/>
	Details on the Books are as follows:
	<table>
	<tr>
	<th>Title of the Book:</th>
	<td width="10%"> </td>
	<th>Description</th>
	<td width="10%"> </td>
	<th>Author of the Book:</th>
	</tr>
	<x:forEach select="$parsed//book">
	<tr>
	<td colspan><x:out select="title"/></td>
	<td width="10%"> </td>
	<td colspan><x:out select="description"/></td>
	<td width="10%"> </td>
	<td><x:out select="author"/></td>
	</tr>
	</x:forEach>
	</table>
</body>
</html>
