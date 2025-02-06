
package naru;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sn extends Applet implements ActionListener
{
	Button b1,b2;
	int x22,x,x11,x1,x2,x3,x4,x5,x6,x7,x8,x0,x9;
	public void init()
	{
		x22=33;
		x=10;
		x1=215;
		x11=215;
		x2=235;
		x3=237;
		x4=225;
		x5=50;
		x6=180;
		x7=57;
		x8=187;
		x9=72;
		x0=203;
		b1=new Button("Forward=>>>>>");
		b2=new Button("<<<<<<=Backward");
		add(b2);add(b1);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void paint(Graphics g)
	{
		g.drawRect(x1,110, 50, 90);                                                  
		g.drawRect(x11,150, 80, 50);
		Font f=new Font("arial",Font.BOLD,13);
		g.drawLine(0,232,2000,232);
		g.drawLine(0,234,2000,234);
		g.setColor(Color.ORANGE);
		g.fillRect(x,100, 200, 100);
		g.setColor(Color.red);
		g.fillRect(x1,110, 50, 90);
		g.fillRect(x11,150, 80, 50);
		g.fillArc(x2, 112, 60, 82, 0, 90);
		g.setColor(Color.CYAN);
		g.fillArc(x3, 118, 50, 80, 0, 90);
		g.fillRect(x4, 118, 33, 40);
		g.setColor(Color.black);
		g.fillOval(x5, 175, 60, 60);
		g.fillOval(x6, 175, 60, 60);
		g.drawRect(x,100, 200, 100);
		g.drawRect(x4, 118, 33, 40);
		g.drawArc(x2, 112, 60, 82, 0, 90);
		g.setColor(Color.gray);
		g.fillOval(x7, 182, 48, 48);
		g.fillOval(x8, 182, 48,48);
		g.drawLine(0,233,2000,233);
		g.setColor(Color.black);
		g.fillOval(x9, 197, 15, 15);
		g.fillOval(x0, 197, 15, 15);
		g.setFont(f);
		g.drawString("in a journey"
				+ ""
				+ "",x22, 130);
	
		
} 
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1)
	{
		for(int i=0;i<10;i++)
		{
	x22=x22+10;
	x=x+10; x0=x0+10; x9=x9+10;	x1=x1+10;	x2=x2+10;	x3=x3+10;	x4=x4+10;	x5=x5+10;	x6=x6+10;	x7=x7+10;	x8=x8+10;
	x11=x11+10;
	repaint();
	}
	}
	if(ae.getSource()==b2)
	{
		for(int i=0;i<10;i++)
	{x=x-10; x22=x22-10; 	x0=x0-10;x9=x9-10;x1=x1-10;	x2=x2-10;	x3=x3-10;	x4=x4-10;	x5=x5-10;	x6=x6-10;	x7=x7-10;	x8=x8-10;
	x11=x11-10;
	repaint();}
	}
	}
}