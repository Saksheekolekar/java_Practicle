import java.util.*;


class invalidName extends Exception
{
	public String toString()
	{
		return "invalid name";
	}
}
public class employee 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
try
{
	System.out.println("enter employee name:");
	String s1=sc.next();
	for(int i=0;i<s1.length();i++)
	{
		if(!Character.isLetter(s1.charAt(i)))
			throw new invalidName();	
	}
	System.out.println("Employee name:"+s1);
}
catch(Exception e)
{
System.out.println("Error:"+e);
}
}
}
