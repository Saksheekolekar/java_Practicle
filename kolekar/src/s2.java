import java.sql.*;
import java.io.*;

import javax.servlet.*;

public class s2 extends GenericServlet
{

public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();

	try 
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery("select * from customer");
		pw.println("<table border=2>");
		pw.println("<tr><th>customer no<th> customer name<th>address</tr>");
		while(r.next())
		{
			
			pw.println("<tr>");
			pw.println("<td>"+r.getString(1));
			pw.println("<td>"+r.getString(2));
			pw.println("<td>"+r.getString(3));
		}
		pw.println("</table>");
	} catch (Exception e)
	{
		pw.println("error="+e);
	}
	
}	
}