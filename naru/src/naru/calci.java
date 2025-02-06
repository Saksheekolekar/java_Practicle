package naru;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class calculator extends JFrame implements ActionListener
{
	int ch=0;
	Float a=(float)0, b=(float)0, c=(float)0;
	String s="";
	JTextField 	t1;
	JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,be,ba,bs,bm,bdiv,bexit,breset;
	calculator()
	{
		setVisible(true);
		setSize(250,300);
		setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		t1=new JTextField(20);
		 b1=new JButton("1");
		 b2=new JButton("2");
		 b3=new JButton("3");
		 b4=new JButton("4");
		 b5=new JButton("5");
		 b6=new JButton("6");
		 b7=new JButton("7");
		 b8=new JButton("8");
		 b9=new JButton("9");
		 b0=new JButton("0");
		 bd=new JButton(".");
		 be=new JButton("=");
		 ba=new JButton("+");
		 bs=new JButton("-");
		 bm=new JButton("*");
		 bdiv=new JButton("/");
		 bexit=new JButton("exit");
		 breset=new JButton("reset");
		 add(t1);
		 add(b1); add(b2); add(b3); add(ba);
		 add(b4); add(b5); add(b6); add(bs);
		 add(b7); add(b8); add(b9); add(bm);
		 add(b0); add(bd); add(be); add(bdiv);
		 add(bexit); add(breset);
		 b1.addActionListener(this);
		 b2.addActionListener(this);	 
		 b3.addActionListener(this);
		 ba.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 bs.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 bm.addActionListener(this);
		 b0.addActionListener(this);
		 bd.addActionListener(this);
		 be.addActionListener(this);
		 bdiv.addActionListener(this);
		 breset.addActionListener(this);
		 bexit.addActionListener(this);
		 
		 
	}

public void actionPerformed(ActionEvent ae) 
{
if(ae.getSource()==b1)
{
	s=s+1;
	t1.setText(s);
}
if(ae.getSource()==b2)
{
	s=s+2;
	t1.setText(s);
}if(ae.getSource()==b3)
{
	s=s+3;
	t1.setText(s);
}if(ae.getSource()==b4)
{
	s=s+4;
	t1.setText(s);
}if(ae.getSource()==b5)
{
	s=s+5;
	t1.setText(s);
}if(ae.getSource()==b6)
{
	s=s+6;
	t1.setText(s);
}if(ae.getSource()==b7)
{
	s=s+7;
	t1.setText(s);
}if(ae.getSource()==b8)
{
	s=s+8;
	t1.setText(s);
}if(ae.getSource()==b9)
{
	s=s+9;
	t1.setText(s);
}if(ae.getSource()==b0)
{
	s=s+0;
	t1.setText(s);
}if(ae.getSource()==bd)
{
	s=s+".";
	t1.setText(s);
}
if(ae.getSource()==ba)
{ 
	a=Float.parseFloat(s);
	t1.setText("");
	ch=1;s="";
}
if(ae.getSource()==bs)
{ 
	a=Float.parseFloat(s);
	t1.setText("");
	ch=2;s="";
}if(ae.getSource()==bm)
{ 
	a=Float.parseFloat(s);
	t1.setText("");
	ch=3;s="";
}if(ae.getSource()==bdiv)
{ 
	a=Float.parseFloat(s);
	t1.setText("");
	ch=4;s="";
}
if(ae.getSource()==be)
{ 
	b=Float.parseFloat(t1.getText());
	if(ch==1)
	{
		c=a+b;
		t1.setText(""+c);
	}if(ch==2)
	{
		c=a-b;
		t1.setText(""+c);
	}
	if(ch==3)
	{
		c=a*b;
		t1.setText(""+c);
	}
	if(ch==4)
	{
		c=a/b;
		t1.setText(""+c);
	}
}
if(ae.getSource()==breset)
{ 
t1.setText("");
}
if(ae.getSource()==bexit)
{ 
dispose();}
}

}
public class calci
{
public static void main(String[] args)
{
	new calculator();
}
}
