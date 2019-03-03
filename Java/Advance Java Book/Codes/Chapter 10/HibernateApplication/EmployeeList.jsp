<%@ page import="java.util.ArrayList, com.kogent.hibernate.Employee" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
  <head>
    <title></title>
  </head>
  <body>   
    <table width="700"
      border="0" cellspacing="0" cellpadding="0">
      <tr align="left">
        <th>Employee Id</th>
        <th>Name</th>
        <th>Age</th>
        <th>Salary</th>
      </tr>
      <!-- iterate over the results of the query -->


<%	ArrayList employees=((ArrayList) session.getAttribute("employees")); 
if(employees!= null && employees.size()>0)
{
	for(int i=0;i<employees.size();i++)
	{
		Employee emp= (Employee) employees.get(i);
		%>
		  <tr>
		  	<td> <%=emp.getEmployeeId() %> </td>
		  	<td> <%=emp.getName() %> </td>
		  	<td> <%=emp.getAge() %> </td>
		  	<td> <%=emp.getSalary() %> </td>
		  	<td><A href ="/HibernateApplication/DeleteEmployeeServlet?employeeId=<%=emp.getEmployeeId() %>"> Delete</A>
		  	<td><A href ="/HibernateApplication/EditEmployee.jsp?employeeId=<%=emp.getEmployeeId() %>"> Edit</A>
		  </tr>
		  	<%
	 }
 } %>
			  			  	
</table>

 <A href ="/HibernateApplication/AddEmployee.jsp">Add New Employee </A>
  </body>
</html>
