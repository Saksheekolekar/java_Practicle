package secondslips1;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class slip1b extends JFrame implements ActionListener
{
	JLabel L1,L2,L3,L4;
	JTextField t1,t2,t3,t4;
	JButton b1;
  slip1b() 
   {
	  setVisible(true);
	  setSize(100,100);
	  setLayout(new FlowLayout());
	  L1=new JLabel("enter emplyee no:");
	  L2=new JLabel("enter emplyee name:");
	  L3=new JLabel("enter emplyee deign:");
	  L4=new JLabel("enter emplyee salary:");
	  t1=new JTextField(10);
	  t2=new JTextField(10);
	  t3=new JTextField(10);
	  t4=new JTextField(10);
	  b1=new JButton("Insert");
	  add(L1);add(t1);
	  add(L2);add(t2);
	  add(L3);add(t3);
	  add(L4);add(t4);
	  add(b1);
	  b1.addActionListener(this);
   }
public void actionPerformed(ActionEvent ae) 
{
	if(ae.getSource()==b1)
	{
		int eno=Integer.parseInt(t1.getText());
		String ename=t2.getText();
		String des=t3.getText();
		int sal=Integer.parseInt(t4.getText());
		try
		{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
		Statement st=con.createStatement();
		int k=st.executeUpdate("insert into employee values("+eno+",'"+ename+"','"+des+"',"+sal+")");
		if(k>=1)
			JOptionPane.showMessageDialog(this,"record insert succc");
		else
			 JOptionPane.showMessageDialog(this,"error in insertion ");
		
		st.close();
		con.close();
		
			
		} 
		catch (Exception e) 
		{
	 		JOptionPane.showMessageDialog(this,"Error="+e);	
	    }
	
      }
} 
public static void main(String[] args) 
{
	new slip1b();
}
}
