import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class RegisDemo extends JPanel implements ActionListener 
{
	JTextField tx1,tx2,tx3;
	JButton b1,b2;
	RegisDemo()
	{
		tx1=new JTextField(10);
		add(tx1);
		tx2=new JTextField(10);
		add(tx2);
		tx3=new JTextField(10);
		add(tx3);
		b1=new JButton("regist");
		add(b1);
		b2=new JButton("back");
		add(b2);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
		String s2= tx2.getText();
		String s3= tx3.getText();
		try
		{
	Class.forName("com.mysql.cj.jdbc.Driver");
	//String db_url="jdbc:/mysql://localhost:3306/ajava88?usessl=false"
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
	Statement st =con.createStatement();
	String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"')";
	st.executeUpdate(q);
	JOptionPane.showMessageDialog(null,"data Insert");
	tx1.setText("");
	tx2.setText("");
	tx3.setText("");
	con.close();
	}
	
	catch(Exception e1)
	{
		
		System.out.println(e1);
	}
	
}
}


