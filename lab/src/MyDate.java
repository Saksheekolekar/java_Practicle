import java.util.*;
class InvalidDate extends Exception
{
	public String toString()
	{
		return "invalid Date...";
	}
}
public class MyDate
{
int dd,mm,yyyy;
Scanner sc=new Scanner(System.in);
void accept()
{
	try
	{
		System.out.println("Enter date in format dd mm yyyy:");	
		dd=sc.nextInt();
		mm=sc.nextInt();
	    yyyy=sc.nextInt();
	    if(!(((mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)&&dd<=31)||
	    	(mm==2 && dd<=28))||
	    	((mm==4||mm==6||mm==9||mm==11)&& dd<=30)||
	    	(mm>12||mm<0))
	    		throw new InvalidDate();    		
	}
	catch (Exception e)
	{
	System.out.println("ERROR:"+e);	
	}
}
void display()
{
	System.out.println("Date:"+dd+"/"+mm+"/"+yyyy);		
}
public static void main(String[] args)
{
	MyDate md=new MyDate();
	md.accept();
	md.display();
}
}
