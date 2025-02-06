package naru;
import java.util.*;
class Invalid_Days extends Exception
{
	Invalid_Days()
	{
	System.out.println("Invalid_ number of Days");
	}
}
class Invalid_Month extends Exception
{
	Invalid_Month()
	{
	System.out.println("Invalid_ number of months");
	}
}

public class date 
{    static int dd,mm,yyyy;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day:");
	    this.dd=sc.nextInt();
		System.out.println("enter month");
		this.mm=sc.nextInt();
		System.out.println("enter year");
		this. yyyy=sc.nextInt();
	}
	void display()
	{
		System.out.println("date:"+dd+"/"+mm+"/"+yyyy);	
	}
	public static void main(String[] args)
	{
		try
	{
		date d=new date();
		d.accept();
		d.display();
		if(mm<0||mm>12)
		{
		throw new Invalid_Month();	
		}
		if(mm==2&&dd>28)
		{
		throw new Invalid_Days();	
		}
		if(mm==1||mm==3|| mm==7||mm==8||mm==10||mm==12 && dd>31)
		{
		throw new Invalid_Month();	
		}
		if(mm==4||mm==6|| mm==9||mm==11||mm==10 && dd>30)
		{
		throw new Invalid_Month();	
		}
		
	}
	catch(Exception e)
	{
	System.out.println("error:"+e);
	}
}
}
