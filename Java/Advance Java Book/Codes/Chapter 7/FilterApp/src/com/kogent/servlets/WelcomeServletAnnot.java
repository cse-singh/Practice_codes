package com.kogent.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class WelcomeServletAnnot extends HttpServlet
{
    	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
    		res.setContentType("text/html");
    		PrintWriter out = res.getWriter();
    		String username = req.getParameter("username");
    		out.println("<html><body>Welcome:<b>" + username + "<br/><br/>");
    		out.println(new Date().toString() + "</b>");
    		out.println("<p> This servlet invokes the filter that uses annotations in place of a deployment descriptor for marking the filter</p>");
    		out.println("</body></html>");
	}
}
