<%@ page import ="java.util.*" language="java" %>
<html>
<body>
	<center><h1>Using Scripting Elements</h1></center>
	<%! int count,a,b;
	    int fun(int a)
	    {
		return 10*a;
	    }
	%>
	<% 
	    a=1;
	    count++;
	    for (int i=0;i<5;i++) 
	    {
		out.println("Value of i in iteration no."+i+":&nbsp;&nbsp;<b>"+i+"</b><br/>");
	    }
	    b=fun(a);
	    out.println("Value returned by fun():&nbsp;&nbsp;<b>"+b+"</b><br/>");
	%>
	This page is requested by <b><%=count%></b> number of times on date 
	<b><%=new Date()%></b>.
</body>
</html>
