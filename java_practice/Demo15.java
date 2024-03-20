import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java .sql.*;
class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container cn=getContentPane();
	HDemo hm;
	LDemo ld;
	RDemo rg;
	MDemo me;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		hm=new HDemo();
		add("home",hm);
		ld=new LDemo();
		add("ld",ld);
		rg=new RDemo();
		add("rg",rg);
		me=new MDemo();
		add("me",me);
		hm.b1.addActionListener(this);
		hm.b2.addActionListener(this);
		ld.b2.addActionListener(this);
		rg.b2.addActionListener(this);
		ld.b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hm.b1)
		{
			card.show(cn,"ld");
		}
		if(e.getSource()==hm.b2)
		{
			card.show(cn,"rg");
		}
		if(e.getSource()==ld.b2||e.getSource()==rg.b2)
		{
			card.show(cn,"home");
		}
		if(e.getSource()==ld.b1)
			
		{
			String s1=ld.t1.getText();
			String s2=ld.t2.getText();
				try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nehadb?usessl=false","root","root");
		Statement st=con.createStatement();
String q="select * from regis where UNAME='"+s1+"'AND UPASS='"+s2+"'";
ResultSet rs=st.executeQuery(q);
if(rs.next())
{
	
	card.show(cn,"me");
	
}
else
{
	JOptionPane.showMessageDialog(null,"INavlid user name and password");
}
	con.close();
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
		}
	}
}
	
class Demo15
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}




























