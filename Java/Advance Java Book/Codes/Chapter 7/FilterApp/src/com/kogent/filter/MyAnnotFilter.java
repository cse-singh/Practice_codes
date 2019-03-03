package com.kogent.filter;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebFilter(filterName = "MyAnnotFilter", urlPatterns={"/WelcomeServletAnnot"})
public class MyAnnotFilter extends MyGenericFilter 
{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 	throws IOException, ServletException 
	{
    		String password = ((HttpServletRequest) req).getParameter("password");
    		if(password.equals("mypassword")) 
		{
    			String file = ((HttpServletRequest)req).getRequestURI();
    			chain.doFilter(req, res);
		}
		else
		{
    			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
    			pw.println("<html>");
    			pw.println("<head><title>Wrong Password</title></head>");
    			pw.println("<body>");
    			pw.println("<h3>Sorry, the password was incorrect.</h3>");
    			pw.println("</body>");
    			pw.println("</html>");
		}
	}
}
