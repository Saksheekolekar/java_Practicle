package dconnect;
import java.sql.*;
import java.util.*;
public class a1 
{
public static void main(String[] args)
{ 
	try 
	{
	Scanner sc=new Scanner(System.in);
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
	Statement st=con.createStatement();
	System.out.println("enter eno,ename and sal to insert:");
	int eno=sc.nextInt();
	String nm=sc.next();
	int sal=sc.nextInt();
	int k=st.executeUpdate("insert into emp("+eno+",'"+nm+"',"+sal+")");
	if(k>=1)
		System.out.println("insert succeee..");
	st.close();
	con.close();
    }
    catch(Exception e)
	{
    	System.out.println("error"+e);
	}
}
}
