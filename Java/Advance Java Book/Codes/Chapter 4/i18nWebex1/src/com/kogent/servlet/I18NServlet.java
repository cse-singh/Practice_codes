package com.kogent.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class I18NServlet extends HttpServlet 
{
	public void service (HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException 
	{
		String cc=req.getParameter("country");
		String ln=req.getParameter("language");
		Locale l=null;
		if (cc==null)
		l=new Locale(ln);
		else
		l=new Locale(ln,cc);
ResourceBundle rb= ResourceBundle.getBundle("ApplicationResources",l);
		req.setAttribute("resource",rb);
		RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
		rd.forward(req,res);
	}//end service
}// end class
