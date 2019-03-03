<HTML>
<HEAD>
<TITLE>Accessing Scoped Variables</TITLE>
</HEAD>
<BODY>
<TABLE BORDER=2 ALIGN="CENTER">
<TR><TH>
Accessing Scoped Variables
</TABLE>
<P>
<UL>
<LI><B>Accessing attribute1 directly:</B> ${attribute1}
<LI><B>Accessing attribute1 using requestScope implicit object:</B>
${requestScope.attribute1}
<LI><B>Checking whether attribute1 is present in session scope using
sessionScope implict object:</B>${sessionScope.attribute1}
<LI><B>Accessing attribute2 directly:</B> ${attribute2}
<LI><B>Checking whether attribute2 is present in application scope using
applicationScope implict object:</B> ${applicationScope.attribute2}
<LI><B>Accessing attribute3 directly:</B> ${attribute3}
<LI><B>Accessing repeated attribute directly:</B> ${repeated}
<LI><B>Checking repeated attribute only in application scope using
applicationScope implicit object:</B> ${applicationScope.repeated}
</UL>
</BODY>
</HTML>