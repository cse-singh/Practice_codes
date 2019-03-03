<%@page errorPage="Registration.html"%>
<html>
<body>

<jsp:useBean id="regform">
	<jsp:attribute name="class" trim="true">com.kogent.RegForm</jsp:attribute>
	<jsp:attribute name="scope">session</jsp:attribute>
	<jsp:body>
		<jsp:setProperty name="regform" property="*"/>
	</jsp:body>
</jsp:useBean>

<form action="RegProcessFinal.jsp"><pre> <b>
First Name  : <input type="text" name="first_name"/>
Last Name   : <input type="text" name="last_name"/>
Address     : <input type="text" name="address"/> 

<input type="submit" value="Register"/>
</b></pre></form>
</body>
</html>
