package advjava;
import java.util.*;
public class a1setaa 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter limit:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("enter city:");
		String c=sc.next();
		al.add(c);
	}
	System.out.print("list of city is:"+al);
	al.clear();
	System.out.println("\n after removing all:"+al);
}
}
