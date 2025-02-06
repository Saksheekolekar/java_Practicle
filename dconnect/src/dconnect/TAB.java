package dconnect;
import java.util.*;
import java.sql.*;
public class TAB 
{
public static void main(String[] args)
{
	try 
	{   Scanner sc=new Scanner(System.in);
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
		Statement st=con.createStatement();
		System.out.println("enter table name:");
		String tn=sc.next();
		ResultSet r=st.executeQuery("select * from "+tn);
		ResultSetMetaData rsm=r.getMetaData();
		int col=rsm.getColumnCount();
		for (int i = 1; i<=col; i++) 
		{
		System.out.println(rsm.getColumnName(i)+"\t");	
		}
		System.out.println(" ");
		while(r.next())
		{
		 for(int i = 1; i<=col; i++) 
		 {
		 System.out.println(""+r.getString(i));	
		 }	 
		}
		con.close();
	} catch (Exception e)
	{
		System.out.println("error="+e);
	}
	
}	
}