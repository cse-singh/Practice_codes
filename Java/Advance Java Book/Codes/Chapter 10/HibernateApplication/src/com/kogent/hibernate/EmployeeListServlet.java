package com.kogent.hibernate;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kogent.hibernate.EmployeeData;

public class EmployeeListServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		ArrayList employees = EmployeeData.getEmployees();
		//System.out.println(employees.get(1));
		HttpSession session = request.getSession(true);
		
		session.setAttribute("employees", employees);	
		ArrayList employees1=((ArrayList) session.getAttribute("employees")); 
		if(employees1!= null && employees1.size()>0)
		{
			for(int i=0;i<employees1.size();i++)
			{
				Employee emp= (Employee) employees1.get(i);
				System.out.println(emp.getEmployeeId());
				System.out.println(emp.getName());
				System.out.println(emp.getAge());
				System.out.println(emp.getSalary());
				
			 }
		 } 
				
		RequestDispatcher rd=request.getRequestDispatcher("/EmployeeList.jsp");
		rd.forward(request,response);

	}
	
}
