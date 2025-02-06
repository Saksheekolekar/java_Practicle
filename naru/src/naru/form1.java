package naru;
import java.applet.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class form1 extends Applet implements ActionListener
{
	int f=0,n1=0,n2=0;
	Label l1,l2,l3,l4,l5;
	TextField f1,f2,f3,f4,f5;
	Button b1,b2;
    public void init()
        {
		setLayout(new GridLayout(6,2));
		l1=new Label("Enter User Name:");
		l2=new Label("Password:");
		l3=new Label("Confirm Password:");
		l4=new Label("captcha:");
		l5=new Label("addition of captcha:");
		f1=new TextField(15);
		f2=new TextField(10);
		f3=new TextField(10);
		f4=new TextField(5);
		f5=new TextField(5);
		b1=new Button("Submit");
		b2=new Button("Stop");
		add(l1);add(f1);
		add(l2);add(f2);
		add(l3);add(f3);
		add(l4);add(f4);
		add(l5);add(f5);
		add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		Random r=new Random();
		n1=r.nextInt(9);
		n2=r.nextInt(9);
		f4.setText(n1+""+n2);
		}
public void actionPerformed(ActionEvent ae)
{
  String p=f2.getText();
  String cp=f3.getText();
 if(ae.getSource()==b1)
  {
	if(p.length()<6)
	{f=1;
	JOptionPane.showMessageDialog(this, "password lenghth must be 6 or more......");		
	}
	int u=0,d=0,s=0;
	for (int i=0;i<p.length();i++)
	{
	if(Character.isUpperCase(p.charAt(i)))
	u=1;
	if(Character.isDigit(p.charAt(i)))
	d=1;
	if(!Character.isLetterOrDigit(p.charAt(i)))
	s=1;
	}
	if(u==0)
	{f=1;
	JOptionPane.showMessageDialog(this,"must have atleast 1 uppercase");
	}
	if(d==0)
	{f=1;
	JOptionPane.showMessageDialog(this,"must have atleast 1 Digit");	
	}
	if(s==0)
	{f=0;
	JOptionPane.showMessageDialog(this,"must have atleast 1 Symbol");	
	}
	if(!p.equals(cp))
	{f=1;
	JOptionPane.showMessageDialog(this,"does not match to password...");
	}
	if((n1+n2)!=(Integer.parseInt(f5.getText())))
	{f=1;
	JOptionPane.showMessageDialog(this,"Incorrect addition of captcha...");		
	}
	if(f==0)
		JOptionPane.showMessageDialog(this,"||Registered successfully||");
  }
  if(ae.getSource()==b2)
	{
	 removeAll();
    }}}
