package advjava;
import java.util.*;
public class revarlist 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter limit:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("enter string:");
		String s=sc.next();
		al.add(s);
	}
	Collections.reverse(al);
	System.out.println("\n reverse order:"+al);
}
}
