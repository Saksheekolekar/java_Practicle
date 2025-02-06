package advjava;
import java.util.*;
public class a1setba
{
public static void main(String[] args)
{
	TreeSet t=new TreeSet();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter limit:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("enter number:");
		int num=sc.nextInt();
		t.add(num);
	}
	System.out.println("sorted elements:"+t);
}
}
