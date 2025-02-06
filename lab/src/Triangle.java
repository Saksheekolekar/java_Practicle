import java.util.*;
interface shape 
{
void area();	
}
public class Triangle implements shape
{
Scanner sc=new Scanner(System.in);
public void area()
{
	System.out.println("enter base");
	double a=sc.nextDouble();
	System.out.println("enter height");
	double b=sc.nextDouble();
	double c=0.5*a*b;
	System.out.println("Area of triangle"+c);
}
public static void main(String[] args) 
{
Triangle t=new Triangle();
t.area();
}
}
