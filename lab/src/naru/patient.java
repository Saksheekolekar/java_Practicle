package naru;
import java.util.*;
class covidexception extends Exception
{
	public String toString()
	{
		return "Patient is covid positive and need to hospitaized";
	}
}

public class patient 
{	
int age;
float oxy,hrct;
String name;
Scanner sc=new Scanner(System.in);
void accept()
 {
	try
	{
	System.out.println("enter patients name ,age,pat_oxygenlevel and hrct report:");
	name=sc.next();
	age=sc.nextInt();
	oxy=sc.nextFloat();
	hrct=sc.nextFloat();
	if(oxy<95 && hrct>10)
		throw new covidexception();
	System.out.println(" patients name :"+name);
	System.out.println(" patients age:"+age);
	System.out.println(" patients oxygenlevel :"+oxy);
	System.out.println(" patients  hrct report:"+hrct);
	}
	catch(Exception e)
	{
		System.out.println(" ERROR:"+e);	
	}
 }
public static void main(String[] args) 
 {
	patient p=new  patient();
	p.accept();
 }
}
