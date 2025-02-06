package dconnect;
import javax.swing.*;

import java.awt.*;
import java.util.*;

public class jtab extends JFrame
{  
	JTable jtl;
	Vector data,head;
 jtab() 
 {
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
	head=new Vector(); 
	head.add("rno");
	head.add("name");
	head.add("sal");
	Vector row1=new Vector();
	row1.add("2");
	row1.add("ram");	
	row1.add("3477");
	Vector row2=new Vector();
	row2.add("2");
	row2.add("ram");	
	row2.add("3477");
	data=new Vector(); 
	data.add(row1);	data.add(row2);
	jtl=new JTable(data,head);
	JScrollPane js=new JScrollPane(jtl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    add(js);
 }
public static void main(String[] args) 
{
new jtab();
}
}
