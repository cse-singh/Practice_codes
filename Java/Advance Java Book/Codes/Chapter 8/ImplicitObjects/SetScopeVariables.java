import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SetScopeVariables extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
{
req.setAttribute("attribute1", "First Value");
HttpSession session = req.getSession();
session.setAttribute("attribute2", "Second Value");
ServletContext application = getServletContext();
application.setAttribute("attribute3",new java.util.Date());
req.setAttribute("repeated", "Request");
session.setAttribute("repeated", "Session");
application.setAttribute("repeated", "ServletContext");
RequestDispatcher dispatcher =
req.getRequestDispatcher("GetScopeVariables.jsp");
dispatcher.forward(req, res);
}
}