package pack1;
import java.util.*;

 class course 
{
	 public String nc="",cd="",sp="";
public void accept2()
{   Scanner sc=new Scanner(System.in);
	System.out.println("enter name of course:");
	 nc=sc.next();
	System.out.println("enter duration:");
	 cd=sc.next();
}
}
 public class student extends course 
 {
 	public String sn="",sr="",sp="";
 	
 public void accept1()
 {   Scanner sc=new Scanner(System.in);
 	System.out.println("enter name of student:");
     sn=sc.next();
 	System.out.println("enter roll number of student:");
 	 sr=sc.next();
 	System.out.println("enter percentage  of student:");
 	 sp=sc.next();
 }}