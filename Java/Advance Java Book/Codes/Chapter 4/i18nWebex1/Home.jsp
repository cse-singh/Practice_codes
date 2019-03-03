<%@page import="java.util.*"%>
<jsp:include page="index.html"/>
<hr>
<h2>Output</h2><br/>
<%
	ResourceBundle rb= (ResourceBundle) request.getAttribute("resource");
%>
<%=rb.getString("welcome.message")%>
