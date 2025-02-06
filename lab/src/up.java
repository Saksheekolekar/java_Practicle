import java.awt.*;
import java.awt.event.*;
 class  invaliduser extends Exception
 {
	public String toString()
	{
		return "invalid user name or password";
	} 
 }
public class up extends Frame implements ActionListener
{
	int cnt;
Label l1,l2;
TextField t1,t2;
Button b1,b2;
up()
{
setVisible(true);
setSize(400,300);
setLayout(null);
l1=new Label("enter user name:");
l2=new Label("enter  password:");
t1=new TextField(10);
t2=new TextField(10);
b1=new Button("Login");
b2=new Button("clear");
add(l1);
l1.setBounds(50,50,100,100);
add(t1);
t1.setBounds(150,70,200,50);
add(l2);
l2.setBounds(50,150,100,100);
add(t2);
t2.setBounds(150,170,200,50);
add(b1);
b1.setBounds(120,250,100,50);
add(b2);
b2.setBounds(220,250,100,50);
b1.addActionListener(this);
b2.addActionListener(this);
}
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getSource()==b1)
		{
			cnt++;
		if(cnt==3)
			dispose();
		try
		{
		String u=t1.getText();	
		String p=t2.getText();	
		if(!u.equals(p))
			throw new invaliduser();
		 System.out.println("registration success..");	
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);	
		}
		}
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
	}
public static void main(String[] args) 
{
	new up();
}
}
