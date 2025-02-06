import java.sql.*;
import java.io.*;

import javax.servlet.*;

public class t1 extends GenericServlet
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
		String tn=req.getParameter("t1");
		ResultSet r=st.executeQuery("select * from "+tn);
		ResultSetMetaData rsm=r.getMetaData();
		int col=rsm.getColumnCount();
		pw.println("<table>");
		pw.println("<tr>");
		for (int i = 1; i<=col; i++) 
		{
		pw.println("<th>"+rsm.getColumnName(i));	
		}
		pw.println("</tr>");
		while(r.next())
		{
		 pw.println("<tr>");
		 for(int i = 1; i<=col; i++) 
		 {
		 pw.println("<td>"+r.getString(i));	
		 }	
		 pw.println("</tr>");
		}
		pw.println("</table>");
	} catch (Exception e)
	{
		pw.println("error="+e);
	}
	
}	
}