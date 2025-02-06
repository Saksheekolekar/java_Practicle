import java.awt.*;
import java.awt.event.*;
 public class form extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5,l6,l7;
TextField t1,t2;
Choice c1,c2;
Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8;
CheckboxGroup g1,g2,g3;
Button b1;
Panel p1,p2,p3,p4,p5;
form()
{
setVisible(true);
setSize(555, 800);
setTitle("Co-Win Registration");
l1=new Label("Adhar no:");
l2=new Label("Birth year:");
l3=new Label("MObile no:");
l4=new Label("Age Group:");
l5=new Label("Select Hospital:");
l6=new Label("Vaccine:");
l7=new Label("Time slot:");
t1=new TextField(10);
t2=new TextField(10);
c1=new Choice();
for(int i=1900;i<2023;i++)
	c1.add(""+i);
c2=new Choice();
c2.add("Gangadhar Ogale Hospital");c2.add("kamat Hospital");c2.add(" Padhagan Hospital");
g1=new CheckboxGroup();
g2=new CheckboxGroup();
g3=new CheckboxGroup();
ch1=new Checkbox("18 & Above",g1,true);
ch2=new Checkbox("45 & Above",g1,true);
ch3=new Checkbox("Covid Shield",g2,true);
ch4=new Checkbox("Covaxin",g2,true);
ch5=new Checkbox("Spuntnik v",g2,true);
ch6=new Checkbox("Morning",g3,true);
ch7=new Checkbox("Afternoon",g3,true);
ch8=new Checkbox("Evening",g3,true);
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
p5=new Panel();
b1=new Button("Submit");
p1.setLayout(new GridLayout(3,2,3,1));
p1.add(l1);p1.add(t1);
p1.add(l2);p1.add(c1);
p1.add(l3);p1.add(t2);

p2.setLayout(new GridLayout(1,3,1,1));
p2.add(l4);p2.add(ch1);p2.add(ch2);

p3.setLayout(new GridLayout(1,2,1,1));
p3.add(l5);p3.add(c2);

p4.setLayout(new GridLayout(2,4,1,1));
p4.add(l6);p4.add(ch3);p4.add(ch4);p4.add(ch5);
p4.add(l7);p4.add(ch6);p4.add(ch7);p4.add(ch8);

p5.setLayout(new GridLayout(5,1,3,1));

p5.add(p1);
p5.add(p2);
p5.add(p3);
p5.add(p4);
p5.add(b1);
add(p5);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
   {
	if(ae.getSource()==b1)
	{   
		String an=t1.getText();
		String mn=t2.getText();
		if(((an.length()>12)||(an.length()<12)))
		{
		System.out.println(" Registration Failed(invalid adhar number)");	
		}
		else if(((mn.length()<10)||(mn.length()>10)))
		{
			System.out.println(" Registration Failed(invalid mobile number)");	
		}
		else
		{
			System.out.println(" Registration succccc.....");	
		}	
	}
		
   }
public static void main(String[] args) 
{
	new form();
}

}
