import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.*;

 public class Q1   extends GenericServlet 
 {
	 
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		try 
		{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/homework","postgres","root");
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery("select * from product");
		pw.println("<table Border=2 color=red><tr><th> Product Code<th> Product Name<th>Product Price</tr>");
		while(r.next())
		{
		pw.println("<tr>");
		pw.println("<td>"+r.getInt(1));
		pw.println("<td>"+r.getString(2));
		pw.println("<td>"+r.getFloat(3));
		pw.println("</tr>");
		}
		pw.println("</table>");
		} catch (Exception e)
		{
			pw.println("<h1>error="+e);
		}
	}
 }