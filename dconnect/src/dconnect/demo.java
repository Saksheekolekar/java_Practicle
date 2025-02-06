
package dconnect;
import java.sql.*;

public class demo 
{
	public static void main(String[] args)  throws Exception
	{
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 Connection  con=DriverManager.getConnection("Jdbc:Odbc:rbnb2023");
	 Statement st=con.createStatement();
	 int k=st.executeUpdate("insert into emp values(6,'sham',9070)");
	 if(k>=1)
		 System.out.println("record insert  successfull..");
	 else
		 System.out.println("record  not insert ");
	 st.close();
	 con.close(); 
	}

}














