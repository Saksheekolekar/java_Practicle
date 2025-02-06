package naru;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ADDITIN extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
public void init()
{
l1 =new Label("enter first number:");
l2=new Label("enter second number :");
l3=new Label("Addition:");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("add");
b2=new Button("stop");
add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int a=Integer.parseInt(t1.getText());	
int b=Integer.parseInt(t2.getText());
t3.setText(""+(a+b));
}
if(ae.getSource()==b2)
{
	disable();
	}
}
}
