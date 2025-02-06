package naru;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class timg extends Applet implements ActionListener
{
	int c;
Button b1,b2,b3;
public void init()
{
b1=new Button("first image");
b2=new Button("second image");
b3=new Button("third image");
add(b1);add(b2);add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
     { 
      int c=7;	
      this.c=c;                         
      repaint();
     }
    if(ae.getSource()==b2)
    {
	int c=8;     this.c=c;   repaint();	
    }
    if(ae.getSource()==b3)
    {
	int c=9;    this.c=c; 	   repaint();
    }
}
public void paint(Graphics g)
{
	if(c==7)
	{
		Image img=getImage(getDocumentBase(),"hakuna matata.jpg");
		g.drawImage(img,150,150,this);
	}
	else if(c==8)
	{
		Image img1=getImage(getDocumentBase(),"d1.jpg");
		g.drawImage(img1,150,150,this);
	}
	else if(c==9)
	{
		Image img2=getImage(getDocumentBase(),"d2.jpg");
		g.drawImage(img2,150,150,this);
	}
}
}
