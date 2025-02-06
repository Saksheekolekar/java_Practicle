package naru;

import java.awt.*;
import java.awt.event.*;

public class pm extends Frame implements MouseListener
{
	TextField t1;
	pm()
	{
		setVisible(true);
		setSize(250,300);
		setLayout(new FlowLayout());
		t1=new TextField(10);
		add(t1);
		addMouseListener(this);	
	}
	@Override
	public void mouseClicked(MouseEvent me)
	{
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseEntered(MouseEvent me)
	{
	
	}
	@Override
	public void mouseExited(MouseEvent me)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent me) 
	{
		int x=getX();
		int y=getY();
		t1.setText("position="+x+","+y);
		
	} @Override
	public void mouseReleased(MouseEvent me)
	{
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		pm o=new pm();
	}

}
