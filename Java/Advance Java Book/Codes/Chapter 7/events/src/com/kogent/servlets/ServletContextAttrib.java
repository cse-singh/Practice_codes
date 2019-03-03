package com.kogent.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextAttrib extends HttpServlet
{
  	public void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException
  	{
    		response.setContentType("text/html");
    		ServletOutputStream out = response.getOutputStream();
    		out.print("<html>");
    		out.print("<head>");
    		out.print("<title>ServletContext Attributes</title>");
    		out.print("</head>");
    		out.print("<body>");

    		ServletContext context = getServletContext();
    		String action = request.getParameter("action");
    		String name = request.getParameter("name");
    		String value = request.getParameter("value");

    		if (action == null) {}
    		else 
		{
      			if (action.equals("add"))
      			{	
        			String test = (String) context.getAttribute(name);
        			if (test == null)
			        {
					context.setAttribute(name, value);
				        out.print("Added Attribute To ServletContext 						object");
			        } 
				else 
				{
					context.setAttribute(name, value);
          				out.print("Replaced Attribute in ServletContext");
        			}
      			}
      			else if (action.equals("remove"))
      			{
        			String test = (String) context.getAttribute(name);
        			if (test == null) 
				{
          				out.print("Attribute does not exist");
        			} 
				else 
				{
				 	context.removeAttribute(name);
          				out.print("Removed Attribute From ServletContext");
        			}
      			}
     			else
      			{
        			String test = (String) context.getAttribute(name);
        			if (test == null)
        			{
          				context.setAttribute(name, value);
          				out.print("Added Attribute To ServletContext	 						object");
        			} 
				else 
				{
          				context.setAttribute(name, value);
          				out.print("Replaced Attribute in ServletContext");
        			}
      			}
    		}
    		
		out.print("<center> <br /> <br />");
    		out.print("<a href='./servletcontextattrib.html'>");
    		out.print("Back To Home Page");
    		out.print("</a>");
    		out.print("</center>");
    		out.print("</body>");
    		out.print("</html>");
  	}
}
