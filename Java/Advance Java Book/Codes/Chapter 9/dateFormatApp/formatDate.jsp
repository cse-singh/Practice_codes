<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html><head>
		<title>CHECK TIME!!!</title>
		<link rel="stylesheet" type="text/css" href="mystyle.css">
	</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>" />
	<c:set var="los" value="<%=TimeZone.getTimeZone("America/Los_Angeles")%>" />
	<c:set var="lon" value="<%=TimeZone.getTimeZone("Europe/London")%>" />
	<c:set var="rom" value="<%=TimeZone.getTimeZone("Rome ")%>" />
	<c:set var="pari" value="<%=TimeZone.getTimeZone("Paris")%>" />
	<c:set var="port" value="<%=TimeZone.getTimeZone("Portugal ")%>" />
	<c:set var="ind" value="<%=TimeZone.getTimeZone("IST")%>" />
    <c:set var="syd" value="<%=TimeZone.getTimeZone("Australia/Sydney")%>" />
<b>CURRENT TIME AT SOME OF THE POPULAR CITIES OF THE WORLD!!</b>  
<BR/>
<BR/>
<table border="1" cellpadding="0" cellspacing="0"
	style="border-collapse: collapse" bordercolor="#111111"
	width="63%" id="AutoNumber2">
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Los Angeles:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$los}">
	<fmt:formatDate value="${now}" timeZone="${los}"
	type="both" />
	</fmt:timeZone>
	</td>
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">London:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$lon}">
	<fmt:formatDate value="${now}" timeZone="${lon}"
	type="both" />
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Rome:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$rom}">
	<fmt:formatDate value="${now}" timeZone="${rom}"
	type="both" />
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Paris:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$pari}">
	<fmt:formatDate value="${now}" timeZone="${pari}"
	type="both" />
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">New- Delhi:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$ind}">
	<fmt:formatDate value="${now}" timeZone="${ind}"
	type="both" />
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Sydney:</td>
	<td width="49%"colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$syd}">
	<fmt:formatDate value="${now}" timeZone="${syd}"
	type="both" />
	</fmt:timeZone>
	</td> 
</tr>
</table> 
<BR>
<BR>
<BR>
<BR>
<B>FORMATTING DATE USING PATTERN:<B>
<BR>
<BR>
<table border="1" cellpadding="0" cellspacing="0"
style="border-collapse: collapse" bordercolor="#111111"
width="63%" id="AutoNumber2">
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Los Angeles:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$los}">
	<fmt:formatDate value="${now}" timeZone="${los}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss" />
	</fmt:timeZone>
	</td>
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">London:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$lon}">
	<fmt:formatDate value="${now}" timeZone="${lon}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss"/>
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Rome:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$rom}">
	<fmt:formatDate value="${now}" timeZone="${rom}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss"/>
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Paris:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$pari}">
	<fmt:formatDate value="${now}" timeZone="${pari}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss"/>
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">New- Delhi:</td>
	<td width="49%" colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$ind}">
	<fmt:formatDate value="${now}" timeZone="${ind}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss" />
	</fmt:timeZone>
	</td> 
</tr>
<tr>
	<td width="51%" colspan="2" bgcolor="yellow">Sydney:</td>
	<td width="49%"colspan="2" bgcolor="yellow">
	<fmt:timeZone value="$syd}">
	<fmt:formatDate value="${now}" timeZone="${syd}"
	type="both" pattern="dd-MMM-yyyy hh:mm:ss"/>
	</fmt:timeZone>
	</td> 
</tr>
</table>                   
</body>
</html>
