import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener 
{
CardLayout card;
Container cn=getContentPane();
HomeDemo hm;
LoginDemo lg;
RegisDemo rg;
MenuDemo1 me;
FDemo()
{
card=new CardLayout();
setLayout(card);
hm = new HomeDemo();
add("Home",hm);
lg =new LoginDemo();
add("lg",lg);
rg=new RegisDemo();
add("rg",rg);
me=new MenuDemo1();
add("mee",me);
hm.b1.addActionListener(this);
hm.b2.addActionListener(this);
lg.b2.addActionListener(this);
rg.b2.addActionListener(this);
lg.b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==hm.b1)
	{
		card.show(cn,"lg");
		
	}
	if(e.getSource()==hm.b2)
	{
		card.show(cn,"rg");
	}
	if(e.getSource()==lg.b2||e.getSource()==rg.b2)
	{
		card.show(cn,"Home");
	}
	if(e.getSource()==lg.b1)
	{
		String s1=lg.tx1.getText();
String s2=lg.tx2.getText();
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
	Statement s= con.createStatement();
	String q="Select * from regis where UNAME='"+s1+"'AND UPASS='"+s2+"'";
	ResultSet rs=s.executeQuery(q);
	if(rs.next())
	{
		card.show(cn,"mee");
	}
	else
	{	
	JOptionPane.showMessageDialog(null,"invalid user name and password");
	}
	lg.tx1.setText("");
	lg.tx2.setText("");
	con.close();
	}
catch(Exception e1)
{
	System.out.println(e1);
}
	}
}
}
class Demo7
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setBounds(100,100,500,500);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}


