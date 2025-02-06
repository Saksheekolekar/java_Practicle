

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cdemo extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException 
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	String s1=req.getParameter("t1");
	String s2=req.getParameter("t2");
	Cookie ck=new Cookie(s1, s2);

	res.addCookie(ck);
	pw.println("<h1> cookie added successfully..");
	 Cookie c[]=req.getCookies();
	 for(int i=0;i<c.length;i++)
	 
	 {
		 pw.println("<h2> cookie name: "+c[i].getName());
		 pw.println("<h2> cookie value:"+c[i].getValue()); 
	 }
	
	
		
	}

}
