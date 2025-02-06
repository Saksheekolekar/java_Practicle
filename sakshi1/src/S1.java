import java.io.*;
import java.sql.*;
import javax.servlet.*;


public  class S1 extends GenericServlet
 {
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
	 res.setContentType("text/html");	
	 PrintWriter pw=res.getWriter();
	try{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
		String q="select * from customer";
		Statement st=con.createStatement();
		ResultSet r=st.executeQuery(q);
		pw.println("<table><tr><th>Customer No<th>Customer Name<th> Address</tr>");
		while(r.next())
		{
			pw.println("<tr>");
			pw.println("<td>"+r.getString(1));
			pw.println("<td>"+r.getString(2));
			pw.println("<td>"+r.getString(3));
		}
		pw.println("</table>");
		st.close();
		r.close();
		con.close();
	    }
	catch(Exception e)
	   {
		pw.println("Error="+e);
	   }
	}
	 
 }