package ttread;
import java.awt.*;
import java.applet.*;
public class Stext extends Applet implements Runnable
{
int i,j=2;
Thread th;

	public void init() 
	{
		th= new Thread(this);
		th.start();
	}
	
	public void run()
	{	
	try {
	for(;;)
	{
		i++;
	th.sleep(30);
	repaint();
	} }
	catch (Exception e) 
	{}	
	}
	public void paint(Graphics g)
	{  Font f=new Font("arial",Font.BOLD,25);
        g.setFont(f);
        if(i==1500)
        { 
        	j++;i=0;
        }
        if(j%2==0)
		g.drawString("RBNB COLLEGE",i, 100);
        else
        g.drawString("RBNB COLLEGE",1500-i, 100);
		}
}