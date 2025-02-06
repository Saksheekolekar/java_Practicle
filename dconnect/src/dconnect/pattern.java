package dconnect;

public class pattern 
{
public static void main(String[] args)
{ 

	String s="welcome",reverse="";
	for(int i=4;i>=1;i--)
	{
		for(int j=i;j>1;j--)
		{
			System.out.print("\t");
		}
		for(int j=i;j<=4;j++)
		{
			System.out.print("*    ");
		}
		
		System.out.println("\n");
	}
	for(int i=3;i>=1;i--)
	{
		for(int j=3;j>=i;j--)
		{
			System.out.print("\t");
		}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*\t");
	}
	for(int j=2;j<=i;j++)
	{
		System.out.print("*\t");
	}
	System.out.println("\n");
	}
}		

}
