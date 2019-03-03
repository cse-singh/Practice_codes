<%@ page language="java" %>
<%@ page import="com.kogent.hibernate.EmployeeData, com.kogent.hibernate.Employee" %>


<html>
  <head>
    <title></title>
  </head>

  <body>
    <%
    String employeeId = request.getParameter("employeeId");
    Employee emp = null;
    emp= EmployeeData.getEmployee(employeeId);
    %>

    <form action="/HibernateApplication/EditEmployeeServlet">
      <table width="500" border="0">
        <tr>
          <td>Employee Id</td>
          <td> <%=emp.getEmployeeId() %> <input type = "hidden" name ="employeeId" value=<%=emp.getEmployeeId() %>></td>
        </tr>
        <tr>
          <td>Employee Name</td>
          <td><input type="text" name="name" value=<%=emp.getName()%>></td>
        </tr>
        <tr>
          <td>Employee Age</td>
          <td><input type="text" name="age" value=<%=emp.getAge() %>></td>
        </tr>
        <tr>
          <td>Employee Salary</td>
          <td><input type="text" name="salary" value=<%=emp.getSalary() %>></td>
        </tr>
        <tr>
          <td> <input type="submit" name ="submit" value="submit"> </td>
        </tr>
      </table>

</form>
  </body>
</html>
