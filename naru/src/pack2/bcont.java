package pack2;

import java.applet.*;
import java.awt.*;

public class bcont extends Applet implements Runnable
{
int i; Thread th;
public void init() 
{ 
 th=new Thread(this);
th.start();
}
	public void paint(Graphics g) 
{
Image img=getImage(getDocumentBase(),"d1.jpg");		
if(i%2==0)
{
	g.drawImage(img,150,150,this);
}
}
public void run() 
		{
		try {
			for(;;)
			{
				i++;
				th.sleep(3);
				repaint();
			}
			
		} 
		catch (Exception e) 
		{
		}	
		}
}
