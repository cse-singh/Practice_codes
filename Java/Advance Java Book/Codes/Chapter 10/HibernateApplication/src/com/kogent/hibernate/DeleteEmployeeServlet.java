package com.kogent.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteEmployeeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String employeeId = request.getParameter("employeeId");
		System.out.println("employee Iddddddd  "+employeeId);
		
		//EmployeeData emplData; // = new EmployeeData();
		try
		{
			
			EmployeeData.deleteEmployee(employeeId);
		
			ArrayList employees = EmployeeData.getEmployees();
			
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
