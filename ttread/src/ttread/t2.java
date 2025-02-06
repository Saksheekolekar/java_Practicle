package ttread;

import java.awt.*;
class t2 extends Frame implements Runnable
{
Thread th;
TextField t1;
String s;
t2(String s)
{
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
t1=new TextField(10);
th=new Thread(this);
this.s=s;
add(t1);
th.start();
}
public void run()
{
		try{
			for(; ;)
		    {
			for(int i=0;i<s.length();i++)
			{
				t1.setText(t1.getText()+s.charAt(i));
				th.sleep(1000);
			}
			t1.setText("");
			}
			
		}
		catch(Exception e){}
		
}	
public static void main(String[] args) 
{
	t2 ob1=new t2("rbnb colege");
}
}

