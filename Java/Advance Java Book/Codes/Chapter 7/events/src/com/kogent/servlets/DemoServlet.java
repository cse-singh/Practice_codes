package com.kogent.servlets;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException 
    	{
        	PrintWriter pw = response.getWriter();
        	response.setContentType("text/html");
        	pw.println("<html><head></head><body>");
        	pw.println("Hello World: This Servlet has been initialized");
        	pw.println("</body></html>");
    	} 
}
