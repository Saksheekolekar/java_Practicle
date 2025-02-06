
import java.io.*;
public class HTHERE
{

public static void main(String args[])throws Exception
{
	 
FileInputStream f1=new FileInputStream("c:\\sample.txt");
int k;
StringBuffer s1=new StringBuffer();
while((k=f1.read())!=-1)
{
	s1.append((char)k);
}
s1.reverse();
System.out.println(s1);
f1.close();
s1.reverse();
String s=new String(s1);
System.out.println(s.toUpperCase());

}

}