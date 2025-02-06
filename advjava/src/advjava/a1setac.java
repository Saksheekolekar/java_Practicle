package advjava;
import java.util.*;
public class a1setac 
{
public static void main(String[] args) 
{
	TreeSet a1=new TreeSet();
a1.add("ww");

	TreeSet a2=new TreeSet();
	a2.add("red");
	a2.add("blue");
	a2.add("white");
	a1.addAll(a2);
	System.out.println("new treeset is"+a1);
	
}

}
