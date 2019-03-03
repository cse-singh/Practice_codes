package com.kogent.servlets;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionCreateServlet extends HttpServlet 
{ 
     	@Override
	public void doGet (HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
   	{
      		// Get the session object.
      		HttpSession session = req.getSession(true);
       
		// Set content type for the response.
      		res.setContentType("text/html");
       		
		// Then write the data of the response.
		PrintWriter out = res.getWriter();
      		out.println("<HTML><BODY>");
      		out.println("<A HREF=\"/events/mysessiondestroy\">Destroy Session</A>");
      		out.println("<h2>Session Created</h2>");
      		out.println("<h3>Session Data:</h3>");
      		out.println("New Session: " + session.isNew());
      		out.println("<br>Session ID: " + session.getId());
      		out.println("<br>Creation Time: " + new Date(session.getCreationTime()));
      		session.setAttribute("User", "kogent");
      		out.println("</BODY></HTML>");
     }
}
