package kiranAcademy;

import java.util.Scanner;

public class Swap {
	
	 public void swap(int a,int b) {
		 int temp;
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println("after Swapping values are : \n a= "+a+"\n b ="+b);
	 } 
	 
	 public void add(int a,int b) {
	   System.out.println("Addition="+(a+b));
	 }
	 
	 double area(int r){
		 return (double)3.14*r*r;
	 }
	 
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Swap Sv= new Swap();

		System.out.println("choices are:\n1)swap two avriable\n 2)additon of two number\n 3)arera of cicle");
		System.out.println("\nenter Choice:");
		int ch=sc.nextInt();
		int a,b,r;
		
		switch (ch) 
		{
		case 1:System.out.println("enter two number as a and b resp:");
				 a=sc.nextInt();
				 b=sc.nextInt();
				Sv.swap(a, b);
				break;
		case 2:System.out.println("enter two number as a and b resp:");
			   a=sc.nextInt();
				b=sc.nextInt(); 
				Sv.add(a, b);
				break;
		case 3:System.out.println("enter radius");
		        r=sc.nextInt();
		       System.out.println("Area of circle with radius :"+r+" is "+Sv.area(r));
			   break;
		default:System.out.println("Invalid Chaoice:");
			break;
		}
	}

}
