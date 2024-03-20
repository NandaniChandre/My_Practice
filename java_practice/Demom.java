import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
class Demom extends JPanel
{
JTabbedPane tab1;
InsertDemo ins;
Search dc;
Show sh;
Demom()
{
setLayout(new BorderLayout());
tab1=new JTabbedPane();
 ins=new InsertDemo();
 dc=new Search();
 sh=new Show();
 
 tab1.addTab("insert",ins);
tab1.addTab("search",dc);
tab1.addTab("show",sh);




add(tab1);

}
}



class InsertDemo extends JPanel implements ActionListener
{
JLabel u1,u2,u3,u4,u5;
JButton b1;
JTextField t1,t2,t3,t4,t5;
InsertDemo()
{
setLayout(null);

u1=new JLabel("Enter rno");
u1.setBounds(50,50,180,40);
add(u1);
t1=new JTextField();
t1.setBounds(200,50,120,30);
add(t1);

u2=new JLabel("Enter Name");
u2.setBounds(50,100,180,40);
add(u2);
t2=new JTextField();
t2.setBounds(200,100,120,30);
add(t2);

u3=new JLabel("Enter PHY");
u3.setBounds(50,150,180,40);
add(u3);
t3=new JTextField();
t3.setBounds(200,150,120,30);
add(t3);

u4=new JLabel("Enter Che");
u4.setBounds(50,200,180,40);
add(u4);
t4=new JTextField();
t4.setBounds(200,200,120,30);
add(t4);

u5=new JLabel("Enter MAths");
u5.setBounds(50,250,180,40);
add(u5);
t5=new JTextField();
t5.setBounds(200,250,120,30);
add(t5);

b1=new JButton("Insert");
b1.setBounds(200,330,85,30);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s1=t1.getText();
	String s2=t2.getText();
	String s3=t3.getText();
	String s4=t4.getText();
	String s5=t5.getText();
	try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/benu?usessl=false","root","root");
			Statement s=con.createStatement();
			String q="insert into src values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
			
			
	s.executeUpdate(q);
			
		

				JOptionPane.showMessageDialog(null,"Dtat insert");
	
	
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	
}


class Search extends JPanel implements ActionListener
{
	JLabel u1;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	Search()
	{
		setLayout(null);
		u1=new JLabel("enter roll");
		u1.setBounds(20,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(100,50,120,30);
		add(t1);
		
		b1=new JButton("Search");
		b1.setBounds(300,50,85,45);
		add(b1);
		b2=new JButton("Search");
		b2.setBounds(300,400,85,45);
		add(b2);
		b2.addActionListener(this);
		
		t2=new JTextField();
		t2.setBounds(100,100,120,30);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(100,190,120,30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(100,280,120,30);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(100,360,120,30);
		add(t5);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		if(e.getSource()==b1)
		{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/benu?usessl=false","root","root");
			Statement s=con.createStatement();
			String q="select * from src where URNO='"+s1+"'";
			
		ResultSet rs=s.executeQuery(q);
			
			if(rs.next())
			{
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
				t4.setText(rs.getString(4));
			t5.setText(rs.getString(5));
			}
			else
			{

				JOptionPane.showMessageDialog(null,"invalid rollno");
			}
	
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
		
		
		if(e.getSource()==b2)
		{
			String s11=t2.getText();
			String s2=t3.getText();
			String s3=t4.getText();
			String s4=t5.getText();
try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/benu?usessl=false","root","root");
			Statement s=con.createStatement();
			String q="update src set UNAME='"+s11+"',UPHY='"+s2+"',UCHE='"+s3+"',UMATHS='"+s4+"'where URNO='"+s1+"'";
			s.executeUpdate(q);
			
			
				JOptionPane.showMessageDialog(null,"data update");
		
	
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}
	}
}
/*class Show extends JPanel
{
	DefaultTableModel model;
	JTable tb;
	JScrollPane sr;
	Show()
	{
	*/	

				