package advjava;
import java.util.*;
public class a1setab 
{
public static void main(String[] args) 
{
	LinkedList al=new LinkedList();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of friends:");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("enter friends:");
		String c=sc.next();
		al.add(c);
	}
	System.out.print("list of friends:"+al);
	}
}
