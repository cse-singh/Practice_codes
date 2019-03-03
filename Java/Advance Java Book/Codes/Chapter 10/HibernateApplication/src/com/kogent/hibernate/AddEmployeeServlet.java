package com.kogent.hibernate;

import com.kogent.hibernate.Employee;
import com.kogent.hibernate.EmployeeData;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

public class AddEmployeeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String employeeId = request.getParameter("employeeId");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		
		Employee emp = new Employee();
		EmployeeData emplData = new EmployeeData();
		try
		{
			emp.setEmployeeId(Integer.parseInt(employeeId));
			emp.setName(name);
			emp.setAge(Integer.parseInt(age));
			emp.setSalary(Double.parseDouble(salary));
			
			emplData.addEmployee(emp);
		
			ArrayList employees = EmployeeData.getEmployees();
			//System.out.println(employees.get(1));
			HttpSession session = request.getSession(true);
			
			session.setAttribute("employees", employees);	
			//ArrayList employees1=((ArrayList) session.getAttribute("employees"));
		}
		catch(Exception e) {
			System.out.println("Exception caught in AddEmployeeServlet" + e);
				}
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/EmployeeList.jsp");
		rd.forward(request,response);
	}

}
