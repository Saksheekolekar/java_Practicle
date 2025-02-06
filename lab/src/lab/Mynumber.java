package lab;
public class Mynumber
{
private int n;
Mynumber()
{
n=0;	
}
Mynumber(int n)
{
this.n=n;	
}
boolean isNegative()
{
	if(n<0)
		return true;
	else 
		return false;
}
boolean isPositive()
{
	if(n>0)
		return true;
	else 
		return false;
}
boolean isZero()
{   if(n==0)
		return true;
	else 
		return false;	
}
boolean isodd()
{
	if(n%2!=0)
		return true;
	else 
		return false;
}
boolean iseven()
{
	if(n%2==0)
		return true;
	else 
		return false;
}
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);	
Mynumber ob=new Mynumber(n);
if(ob.isNegative())
	System.out.println(" number is negative");
if(ob.isPositive())
	System.out.println(" number is positive");
if(ob.isZero())
	System.out.println(" number is zero");
if(ob.iseven())
	System.out.println(" number is even");
if(ob.isodd())
	System.out.println(" number is odd");

}
}
