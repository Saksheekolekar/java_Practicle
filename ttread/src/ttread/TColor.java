package ttread;
import java.util.*;
import java.awt.*;

public class TColor extends Frame implements Runnable
{
int i; Thread th;
 TColor()
{
	 setVisible(true);
	 setSize(500,500);
     th=new Thread(this);
     th.start();
}
 
	public void run()
	{
		try {
			for(;;)
			{
				Random r=new Random();
				int r1=r.nextInt(255);
				int b=r.nextInt(255);
				int g=r.nextInt(255);
				Color c=new Color(g,r1,b);
				setBackground(c);
				th.sleep(1000);
				
			}
			
		}
		catch (Exception e)
		{
		}
	}
	public static void main(String[] args)
	{
		new TColor();
	}
 
}
