package naru;
import java.applet.*;import java.awt.*;import java.awt.event.*;
public class show extends Applet implements MouseListener,KeyListener 
 {
    String s="Saksheee";
	public void init()
	{
		addMouseListener(this);
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{   Font f=new Font("arial",Font.BOLD,50);
	    g.setFont(f);
		g.drawString(s,100, 100);
	}
	public void mouseClicked(MouseEvent me)
	{
	s="mouse clicked......";
	repaint();
	}
	public void mouseExited(MouseEvent me)
	{
	s="mouse exited......";
	repaint();
	}
	public void mousePressed(MouseEvent me)
	{
	s="mouse presseed......";
	repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
	s="mouse released......";
	repaint();
	}	
	public void mouseEntered(MouseEvent me) 
	{
	s="mouse entered......";
	repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
	s="key typed......";
	repaint();
	}
	public void keyReleased(KeyEvent ke) 
	{
	s="key released.....";
	repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
	s="key pressed.....";
	repaint();
	}}
