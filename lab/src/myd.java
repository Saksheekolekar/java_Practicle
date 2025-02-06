import java.awt.*;
import java.awt.event.*;

public class myd extends Frame implements ItemListener
{
String h="", cl="",fn="",name="";
int s=0,st=0,cnt1=0,cnt2=0,cnt3=0;
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2;
Choice chh1,chh2;
CheckboxGroup g1;
Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9;
Panel p2,p3;
	
 myd()
{
setVisible(true);
setSize(800,800);
l1=new Label("Your Name:");	
l2=new Label("Your Class:");	
l3=new Label("Your Habbies:");	
l4=new Label("Font:");	
l5=new Label("Size:");	
l6=new Label("Style:");	
t1=new TextField(10);
t2=new TextField(10);
chh1=new Choice();
chh1.add("Arial");chh1.add("Cambria");
chh2=new Choice();
for(int i=1;i<200;i++)
chh2.add(""+i);
g1=new CheckboxGroup();
c1=new Checkbox("FY",g1,true);
c2=new Checkbox("SY",g1,true);
c3=new Checkbox("TY",g1,true);
c4=new Checkbox("Music");
c5=new Checkbox("Sports");
c6=new Checkbox("Travelling");
c7=new Checkbox("Bold");
c8=new Checkbox("Itallic");
c9=new Checkbox("Underline");


p2=new Panel();
p2.setLayout(new GridLayout(4,4,1,1));
p2.add(l2);p2.add(l3);p2.add(l4);p2.add(l6);
p2.add(c1);p2.add(c4);p2.add(chh1);p2.add(c7);
p2.add(c2);p2.add(c5);p2.add(l5);p2.add(c8);
p2.add(c3);p2.add(c6);p2.add(chh2);p2.add(c9);
add(p2);

p3=new Panel();

p3.setLayout(null);
p3.add(l1);
l1.setBounds(50, 20, 70, 50);
p3.add(t1);
t1.setBounds(120, 30, 300, 25);
p3.add(p2);
p2.setBounds(50, 80, 400, 400);
p3.add(t2);
t2.setBounds(40, 480, 400, 50);
add(p3);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
c8.addItemListener(this);
c9.addItemListener(this);
chh1.addItemListener(this);
chh2.addItemListener(this);
}

public void itemStateChanged(ItemEvent ie)
{ name=t1.getText();
	if (ie.getSource()==c1)
	{
		 cl="FY";
	}
	if (ie.getSource()==c2)
	{
		cl="SY";
	}
	if (ie.getSource()==c3)
	{
        cl="TY";
	}
	
	if (ie.getSource()==c4)
	{
		cnt1++;
		h=h+"Music";
		if(cnt1%2==0)
		h=h.replace("Music","");
	}
	if (ie.getSource()==c5)
	{   
		cnt2++;
		h=h+"Sports";
		if(cnt2%2==0)
		h=h.replace("Sports","");
		
	}
	if (ie.getSource()==c6)
	{ 
		cnt3++;
		h=h+"Travelling";
		if(cnt3%2==0)
		h=h.replace("Travelling","");
		
	}
	
	if (ie.getSource()==c7)
	{
        
        st=Font.BOLD;
	}
	if (ie.getSource()==c8)
	{
        
        st=Font.ITALIC;
	}
	if (ie.getSource()==c9)
	{
       
        st=Font.PLAIN;
	}
	
	if(ie.getSource()==chh2)
	{
	 s=Integer.parseInt(chh2.getSelectedItem().toString());	
	}
	if(ie.getSource()==chh1)
	{
		 fn=chh1.getSelectedItem().toString();
	}
	
	
	t2.setText("name:"+name+"  class:"+cl+"  Hobbies:"+h);
	
	t2.setFont(new Font(fn,st,s));
}
 public static void main(String[] args)
 {
	
new myd();	
}
}
