
package mathematics;
 
public class power
{
	public void powert(int x,int y)
	{
		int m=1;
		int n=y;
		while(y>0)
		{
			m=m*x;
			y--;
		}
		System.out.println(n+"th power of "+x+" is "+m);
	}
	public void max(int x,int y)
	{
		if(x>y)
			System.out.println(x+" is maximum");
		else
			System.out.println(y+" is maximum");
	}
}