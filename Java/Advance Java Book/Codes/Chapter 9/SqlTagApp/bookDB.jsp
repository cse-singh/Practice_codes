<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql" %>
<sql:setDataSource var="datasource" 
	driver="oracle.jdbc.driver.OracleDriver" 
	url="jdbc:oracle:thin:@192.168.1.123:1521:XE" user="scott" password="tiger"
	/>
<sql:query var="books" dataSource="${datasource}">
	SELECT id, title, price FROM book 
</sql:query>
<html>
	<head>
		<title>Accessing Database using JSTL</title>
	</head>
	<h2> Books Available in the Database</h2>
	<body>
		<table border="1">
		<tr>
		<td>id</td><td>title</td><td>price</td>
		</tr>
		<c:forEach varStatus="status" items="${books.rows}" var="row"> 
		<tr>
		<td><c:out value="${row.id}" /></td>
		<td><c:out value="${row.title}" /></td>
		<td><c:out value="${row.price}" /></td>
		</tr>
		</c:forEach> 
		</table>
	</body>
</html>
