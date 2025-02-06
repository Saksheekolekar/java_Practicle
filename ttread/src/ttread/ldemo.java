package ttread;

import java.applet.*;
import java.awt.*;

public class ldemo extends Applet implements Runnable
{
int i;
Thread th;
	public void init()
	{
		th=new Thread(this);
		th.start();
		
	}
	public void run()
		{
			try 
			{
				for(i=100;i<=300;i=i+50)
				{
					repaint();
					th.sleep(2000);
				}
			}
			catch (Exception e)
			{
			
			}
		}
		
	public void update(Graphics g) 
		{
		 g.drawLine(i, 100, i, 400);
		}
}
