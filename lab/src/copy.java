import java.io.FileInputStream;


public class copy 
{
public static void main(String[] args) throws Exception
{
	FileInputStream fm=new FileInputStream("d:\\sakshi\\login.txt");
	int k;
	StringBuffer sb=new StringBuffer();
	while((k=fm.read())!=-1)
	{
		sb.append((char)k);
	}
	sb.reverse();
	System.out.println(sb);
	fm.close();
	sb.reverse();
	String s=new String(sb);
	System.out.println(s.toUpperCase());
}
}
