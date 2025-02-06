import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;



public class demo1 extends HttpServlet
{

public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String s1=req.getParameter("t1");
	String s2=req.getParameter("t2");
	int c=Integer.parseInt(s1)+Integer.parseInt(s2);
	pw.println("<h1>addition="+c);
}
}
