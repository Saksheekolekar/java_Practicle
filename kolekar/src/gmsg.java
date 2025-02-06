import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class gmsg extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String u=req.getParameter("t1");
	Date d=new Date();
	int h=d.getHours();
	if(h>12&&h<=17)
	pw.println("<h1>Good Afternoon "+u);	
	else if(h>17&&h<=20)
		pw.println("<h1>Good Evening "+u);
	else if(h>20&&h<=24)
		pw.println("<h1>Good Night "+u);	
	else
		pw.println("<h1>Good Morning  "+u);
	}
}
