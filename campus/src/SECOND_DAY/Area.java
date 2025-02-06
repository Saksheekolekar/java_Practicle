package SECOND_DAY;
import java.util.Scanner;

public class Area {
	int length,breadth;
	Scanner sc=new Scanner(System.in);
void setDia()
{
	System.out.println("enter length and breadth");
	this.length=sc.nextInt();
	this.breadth=sc.nextInt();
	
}
void getArea(){
	System.out.println("Area is :"+length*breadth);
}
public static void main(String[] args) 
{
Area a=new Area();
a.setDia();
a.getArea();
}
}
