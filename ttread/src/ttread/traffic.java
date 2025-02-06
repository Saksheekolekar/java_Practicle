package ttread;

import java.applet.*;
import java.awt.*;
public class traffic  extends Applet implements Runnable
{
int i=0;
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
		while(true)	
		{
			i++;
			repaint();
			th.sleep(500);
		}
		}
		catch(Exception e)
		{}
			
		}
	
			public void paint(Graphics g)
			{   g.setColor(Color.LIGHT_GRAY);
				g.fillRect(650, 50, 150, 400);
			    g.setColor(Color.black);
				 g.drawOval(670, 80, 100,100);
				 g.drawOval(670, 200, 100,100);
				 g.drawOval(670, 320, 100,100);
				 g.fillRect(692, 450, 50, 500);
				    g.setColor(Color.gray);
				 g.fillRect(670, 900, 100, 100);
				if(i==1)
				{
					g.setColor(Color.red);
					 g.fillOval(671, 81, 99,99);
				}if(i==2)
				{
					g.setColor(Color.yellow);
					 g.fillOval(671, 201, 99,99);
				}if(i==3)
				{
					g.setColor(Color.green);
					 g.fillOval(671, 321, 99,99);
					 i=0;
				}
			}
}
