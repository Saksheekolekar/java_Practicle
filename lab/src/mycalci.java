
import java.awt.*;
import java.awt.event.*;

public class mycalci extends Frame implements ActionListener
{
	int ch=0;
	String s="";
	double a=0,b=0,c=0;
	
	Panel p1;
    TextField t1;
	Button b1,b2,b3, b4,b5,b6,b7,b8,b9,b0,bd,bdiv,badd,bsub,bmul,beq;
	public mycalci() 
	{ setVisible(true);
	  setSize(500,400);
	  setTitle("Simple Calculator");
	  setLayout(new GridLayout(2,1,10,10));
	    t1=new TextField(10);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		bd=new Button(".");
		badd=new Button("+");
		bsub=new Button("-");
		bmul=new Button("*");
		bdiv=new Button("/");
		beq=new Button("=");
		
		p1=new Panel();
		p1.setLayout(new GridLayout(4,4,20,20));
		p1.add(b1);p1.add(b2);p1.add(b3);p1.add(badd);
		p1.add(b4);p1.add(b5);p1.add(b6);p1.add(bsub);
		p1.add(b7);p1.add(b8);p1.add(b9);p1.add(bmul);
		p1.add(b0);p1.add(bd);p1.add(beq);p1.add(bdiv);
			
		add(t1);
		add(p1);
			
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	bd.addActionListener(this);
	bdiv.addActionListener(this);
	bmul.addActionListener(this);
	bsub.addActionListener(this);
	badd.addActionListener(this);
	beq.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			s=t1.getText()+"1";
			t1.setText(""+s);
		}
		if(ae.getSource()==b2)
		{
			s=t1.getText()+"2";
			t1.setText(s);
		}
		if(ae.getSource()==b3)
		{
			s=t1.getText()+"3";
			t1.setText(""+s);
		}
		if(ae.getSource()==b4)
		{
			s=t1.getText()+"4";
			t1.setText(""+s);
		}
		if(ae.getSource()==b5)
		{
			s=t1.getText()+"5";
			t1.setText(""+s);
		}
		if(ae.getSource()==b6)
		{
			s=t1.getText()+"6";
			t1.setText(""+s);
		}
		if(ae.getSource()==b7)
		{
			s=t1.getText()+"7";
			t1.setText(""+s);
		}
		if(ae.getSource()==b8)
		{
			s=t1.getText()+"8";
			t1.setText(""+s);
		}
		if(ae.getSource()==b9)
		{
			s=t1.getText()+"9";
			t1.setText(""+s);
		}
		if(ae.getSource()==b0)
		{
			s=s+0;
			t1.setText(""+s);
		}
		if(ae.getSource()==bd)
		{
			s=t1.getText()+".";
			t1.setText(""+s);
		}
		if(ae.getSource()==badd)
		{  
			 a=Double.parseDouble(t1.getText());
			t1.setText("");
			s="";
			ch=1;
			 
		}
		if(ae.getSource()==bmul)
		{
			 ch=2;
				a=Double.parseDouble(t1.getText());
				t1.setText("");
				s="";
		}
		if(ae.getSource()==bdiv)
		{
			  ch=3;
				a=Double.parseDouble(t1.getText());
				t1.setText("");
				s="";
		}
		if(ae.getSource()==bsub)
		{
			 ch=4;
				a=Double.parseDouble(t1.getText());
				t1.setText("");
				s="";
		}
		if(ae.getSource()==beq)
		{
			b=Double.parseDouble(t1.getText());
			
			if(ch==1)
			{	
		     c=a+b;	
		    t1.setText(""+c);
			}
			if(ch==2)
			{	
		     c=a*b;	
		    t1.setText(""+c);
			}
			
			if(ch==3)
			{	
		     c=a/b;	
		    t1.setText(""+c);
			}
			if(ch==4)
			{	
		    c=a-b;	
		    t1.setText(""+c);
			}
			
       }
		
 }
	public static void main(String[] args)
	{
	new mycalci();	
	}
}
