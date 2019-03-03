<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
<TITLE>Using Implicit Objects</TITLE>
</HEAD>
<BODY>
<TABLE BORDER=2 ALIGN="CENTER">
<TR><TH>
Using Implicit Objects
</TH></TR>
</TABLE>
<P><UL>
<LI><B>Your Email ID is :</B> ${param.email}
<Li><B>You have selected pets:</B>
<c:forEach var="pet" items="${paramValues.pettype}">
&nbsp;&nbsp;${pet}&nbsp;&nbsp;
</c:forEach>
<LI><B>User-Agent Header:</B> ${header["User-Agent"]}
<LI><B>JSESSIONID Cookie Value:</B>
${cookie.JSESSIONID.value}
<LI><B>Server:</B> ${pageContext.servletContext.serverInfo}
</UL>
</BODY>
</HTML>