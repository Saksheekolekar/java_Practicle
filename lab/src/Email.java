
class invalidusername extends Exception
{
	public String toString()
	{
		return "invalid username";
	}
}
class invalidpassword extends Exception
{
	public String toString()
	{
		return "invalid password";
	}
}
public class Email
{
Email()
{}
Email(String u,String p)
{
	try
	{
	if(!u.equals("rbnb"))
		throw new invalidusername();
	if(!p.equals("123"))
		throw new invalidusername();	
	System.out.println("Login Success....");		
	}
	catch(Exception e)
	{
	System.out.println("ERROR:"+e);		
	}
}
public static void main(String[] args)
{
	Email e=new Email(args[0],args[1]);
}
}
