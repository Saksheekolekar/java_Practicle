package ttread;

import java.applet.*;
import java.awt.*;
import java.util.*;

public class Bcolor extends Applet implements Runnable
{
 int i=0,j=2,r1,g,b;
 Thread th;
 Color c;
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
			th.sleep(5);	
			Random r=new Random();
			r1=r.nextInt(255);
			 b=r.nextInt(255);
			g=r.nextInt(255);
			 c=new Color(g,r1,b);
		}
	}
	catch(Exception e)
		{	
	    }
	}
	public void paint(Graphics g) 
	{
    g.setColor(Color.black);
    g.drawLine(500, 900, 1200, 900);
    if(i==300)
    {
    	i=0;
    	j++;	
    }
    if(j%2==0)
    { 
      g.drawOval(750,500+i, 91, 91);
      g.setColor(c);
      g.fillOval(750, 500+i, 90, 90);     
    }
    else	
    { 
    	 g.drawOval(750,500-i, 91, 91);  
         g.setColor(c);
         g.fillOval(750, 500-i, 90, 90); 
	}
	}
}
