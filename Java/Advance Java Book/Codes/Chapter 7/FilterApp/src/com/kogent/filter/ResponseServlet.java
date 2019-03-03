package com.kogent.servlets;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResponseServlet extends HttpServlet 
{
    	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException 
	{
               	res.setContentType("text/html;charset=UTF-8");
        	PrintWriter out = res.getWriter();
        	out.println("This is a TEST SERVLET");   
        	out.close();
    	} 

}
