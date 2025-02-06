package ttread;

import java.applet.*;
import java.awt.*;

import java.util.*;

public class stopwatch extends Applet implements Runnable
{
Thread th;
Date dt;
public void init()
{ 
	th=new Thread(this);
	th.start();
	
}

public void paint(Graphics g)
	{   g.setColor(Color.BLUE);
	    Font f=new Font("arial",Font.BOLD,25);
	    g.setFont(f);
		g.drawString(""+dt,100 ,100);
	}

	public void run()
	{
		try {
			for(;;)
			{ 
				 dt=new Date();
				repaint();
			th.sleep(1000);
			}
			
		} catch (Exception e) {
			
		}
	}
}
