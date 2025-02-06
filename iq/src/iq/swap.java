package iq;
import java.util.*;
public class swap 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter Second number");
	int b=sc.nextInt();
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
