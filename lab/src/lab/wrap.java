package lab;
import java.io.DataInputStream;
import java.util.*;

public class wrap
{
public static void main(String[] args) throws Exception
{
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("enter number=");
	int n=Integer.parseInt(d.readLine());
	System.out.println("binary equivalnet="+Integer.toBinaryString(n));
	System.out.println("octal equivalnet="+Integer.toOctalString(n));
	System.out.println("hexa equivalnet="+Integer.toOctalString(n));
	
}
}
