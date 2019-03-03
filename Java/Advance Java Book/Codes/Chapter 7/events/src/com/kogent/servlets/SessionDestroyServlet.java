package com.kogent.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDestroyServlet extends HttpServlet 
{ 
     	@Override
	public void doGet (HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
   	{
      		// Get the session object.
      		HttpSession session = req.getSession(true);
      		session.removeAttribute("User");

	       	// Invalidate the session.
      		session.invalidate(); 
       
		// Set content type for response.
      		res.setContentType("text/html");

       		// Then write the data of the response.
      		PrintWriter out = res.getWriter();
      		out.println("<HTML><BODY>");
      		out.println("<A HREF=\"/events/index.html\">Reload Welcome Page</A>");
      		out.println("<h2>Session Destroyed</h2>");
      		out.println("</BODY></HTML>");
      		out.close();
   	}
} 
