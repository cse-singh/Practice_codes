<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>example showing JSTL functions</title></head>
<body>
<h2>Using various JSTL 1.2 functions</h2>
<c:set var="var" value="Example showing usage of JSTL functions"/>
The length of the test String: ${fn:length(var)}<br />
Does the test String contain "JSTL"? ${fn:contains(var,"JSTL")}<br />
Putting the String into upper case using fn:toUpperCase(): ${fn:toUpperCase(var)}<br />
Splitting the String into a String array using fn:split(), and returning the array length: ${fn:length(fn:split(var," "))}<br />
</body>
</html>
