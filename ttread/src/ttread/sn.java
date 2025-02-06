
package ttread;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
public class sn extends Applet implements ActionListener,Runnable
{
	Button b1,b2;
	int i;
    Thread th;
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
	public void init()
	{
		
		b1=new Button("Forward=>>>>>");
		b2=new Button("Stop");
		add(b2);add(b1);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void paint(Graphics g)
	{
	 try
	 {
		g.drawRect(215+i,110, 50, 90);                                                  
		g.drawRect(215+i,150, 80, 50);
		Font f=new Font("arial",Font.BOLD,13);
		g.drawLine(0,232,2000,232);
		g.drawLine(0,234,2000,234);
		g.setColor(Color.ORANGE);
		
		g.setColor(Color.red);
		g.fillRect(215+i,110, 50, 90);
		g.fillRect(215+i,150, 80, 50);
		g.fillArc(235+i, 112, 60, 82, 0, 90);
		g.setColor(Color.CYAN);
		g.fillArc(237+i, 118, 50, 80, 0, 90);
		g.fillRect(225+i, 118, 33, 40);
		g.setColor(Color.black);
		g.fillOval(50+i, 175, 60, 60);
		g.fillOval(180+i, 175, 60, 60);
		
		g.drawRect(225+i, 118, 33, 40);
		g.drawArc(235+i, 112, 60, 82, 0, 90);
		g.setColor(Color.gray);
		g.fillOval(57+i, 182, 48, 48);
		g.fillOval(187+i, 182, 48,48);
		g.drawLine(0,233,2000,233);
		g.setColor(Color.black);
		g.fillOval(72+i, 197, 15, 15);
		g.fillOval(203+i, 197, 15, 15);
		g.setFont(f);
		g.drawString("IN A Journey"+ ""+ "",33+i, 130);
	 }
	 catch(Exception e)
	 {}
	} 
	public void actionPerformed(ActionEvent ae)
	{
	 if(ae.getSource()==b1)
	 {
		 th=new Thread(this);
		th.start();	
	 }
	 if(ae.getSource()==b2)
	 {
	 th.stop();	
	 JOptionPane.showMessageDialog(this, "gadi thambli");
	 }
	}
}