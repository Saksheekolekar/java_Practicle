package ttread;

import java.applet.*;
import java.awt.*;

public class bounce extends Applet implements Runnable
{
 int i=0,j=2;
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
			th.sleep(5);	
			
		}
	}
	catch(Exception e)
		{	
	    }
	}
	public void paint(Graphics g) 
	{
   try 
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
      g.drawOval(500,500+i, 91, 91);
      g.drawOval(750,500+i, 91, 91);
      g.drawOval(1000,500+i, 91, 91);
     
      g.setColor(Color.red);
      g.fillOval(500, 500+i, 90, 90);
    
      g.setColor(Color.CYAN);
      g.fillOval(750, 500+i, 90, 90);
      
      g.setColor(Color.orange);
      g.fillOval(1000, 500+i, 90, 90);
      
    }
    else	
    { 
    	  g.drawOval(500,500-i, 91, 91);
          g.drawOval(750,500-i, 91, 91);
          g.drawOval(1000,500-i, 91, 91);
	 
	  g.setColor(Color.red);
	  g.fillOval(500, 500-i, 90, 90);
	  
	    g.setColor(Color.CYAN);
	  g.fillOval(750, 500-i, 90, 90);
	  
	
	  g.setColor(Color.orange);
	  g.fillOval(1000, 500-i, 90, 90);
	}	
    

}
catch(Exception e){}
	}
}
