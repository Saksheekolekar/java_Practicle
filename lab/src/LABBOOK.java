import java.awt.*;
import java.awt.event.*;
public class LABBOOK extends Frame implements ActionListener

{
 TextField t1;
 Label l1,l2,l3,l4,l5,l6;
 Choice ch1,ch2;
 TextArea ta;
 Button b1;
 Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9;
 LABBOOK()
 {
	 setVisible(true);
	 setSize(500,500);
	 setLayout(new FlowLayout());
	 b1=new Button("ok");
	 t1=new TextField(15);
	 l1=new Label("Your Name:");
	 l2=new Label("Your Class:");     
	 l3=new Label("Size:");     
	 l4=new Label("Hobbies:");     
	 l5=new Label("Font:");     
	 l6=new Label("Style:");   
	 CheckboxGroup cg1=new CheckboxGroup();
	 c1=new Checkbox("FY",cg1,true);
	 c2=new Checkbox("SY",cg1,true);
	 c3=new Checkbox("TY",cg1,true);
	 c4=new Checkbox("Music");
	 c5=new Checkbox("Sports");
	 c6=new Checkbox("Traveling");
	 c7=new Checkbox("Bold");
	 c8=new Checkbox("Italic");
	 c9=new Checkbox("Underline");
	 ch1=new Choice();
	 ch1.add("Arial");
	 ch1.add("Times new Roman");
	 ch1.add("Gigi");
	 ch2=new Choice();
	 for(int i=8;i<100;i++)
		 ch2.add(""+i);
	 ta=new TextArea(3,100);
	 Panel p1=new Panel();
	 p1.setLayout(new GridLayout(4,1));
	 p1.add(l2);p1.add(c1);p1.add(c2);p1.add(c3);
	 
	 Panel p2=new Panel();
	 p2.setLayout(new GridLayout(4,1));
	 p2.add(l3);p2.add(c4);p2.add(c5);p2.add(c6);
	 
	 Panel p3=new Panel();
	 p3.setLayout(new GridLayout(4,1));
	 p3.add(l4);p3.add(ch1);p3.add(l5);p3.add(ch2);
	 
	 Panel p4=new Panel();
	 p4.setLayout(new GridLayout(4,1));
	 p4.add(l6);p4.add(c7);p4.add(c8);p4.add(c9);
	 
	 
	 Panel p5=new Panel();
	 p5.setLayout(new GridLayout(1,4));
	 p5.add(p1);p5.add(p2);p5.add(p3); p5.add(p4);
	 
	 add(l1);add(t1);
	 add(p5);
	 add(ta);
	 add(b1);
	 b1.addActionListener(this);
	 }
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource()==b1)
	 {
		 String name=t1.getText();
		 String cl="";
		 if(c1.getState())
			 cl="FY";
		 if(c2.getState())
			 cl="SY";
		 if(c3.getState())
			 cl="TY";
		 
		 String h="";
		 if(c4.getState())
			 h=h+" Music";
		 if(c5.getState())
			 h=h+" Sports";
		 if(c6.getState())
			 h=h+" Traveling";
		 
		 String fn=ch1.getSelectedItem().toString();
		 int s=Integer.parseInt(ch2.getSelectedItem().toString());
		 if(c7.getState())
			 ta.setFont(new Font(fn,Font.BOLD,s));
		 if(c8.getState())
			 ta.setFont(new Font(fn,Font.ITALIC,s));
		 if(c9.getState())
			 ta.setFont(new Font(fn,Font.CENTER_BASELINE,s));
		 
		 ta.setText("Name:"+name+" Class:"+cl+" Hobbies:"+h);
	}
}
 
 public static void main(String []args)
 {
	 new LABBOOK();
 }
}