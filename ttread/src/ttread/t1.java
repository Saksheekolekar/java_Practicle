package ttread;
import java.awt.*;
import java.awt.event.*;

class thdemo extends Frame implements Runnable,ActionListener
{
Thread th;
Button b1;
TextField t1;
public thdemo()
{
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
t1=new TextField(10);
b1=new Button("ok");
th=new Thread(this);
add(t1);add(b1);
b1.addActionListener(this);
}
	public void run()
	{
		try{
			for(int i=1;i<=100;i++)
			{
				t1.setText(" "+i);
				th.sleep(200);
			}
			
		}
		catch(Exception e){}
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getSource()==b1)
		{
			th.start();
		}
	}
	
}
public class t1
{
public static void main(String[] args) 
{
	thdemo ob=new thdemo();
}
}
