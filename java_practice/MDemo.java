import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class MDemo extends JPanel
{
	
		JTabbedPane tab1;
		InsertDemo ins;
		
MDemo()
	{
		setLayout(new BorderLayout());
		tab1=new JTabbedPane();
		
		ins=new InsertDemo();
		
		tab1.addTab("insert",ins);
		
		add(tab1);
	}
}
  
  
 class InsertDemo extends JPanel implements ActionListener 
{
	JButton b1;
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	InsertDemo()
	{
		setLayout(null);
		u1=new JLabel("enter r.no");
		u1.setBounds(50,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(200,50,180,30);
		add(t1);
		
		
		u2=new JLabel("enter name");
		u2.setBounds(50,100,120,40);
		add(u2);
		t2=new JTextField();
		t2.setBounds(200,100,180,30);
		add(t2);
		
		
	u3=new JLabel("enter phy");
		u3.setBounds(50,150,120,40);
		add(u3);
		t3=new JTextField();
		t3.setBounds(200,150,180,30);
		add(t3);
		
		
		
		u4=new JLabel("enter che");
		u4.setBounds(50,200,120,40);
		add(u4);
		t4=new JTextField();
		t4.setBounds(200,200,180,30);
		add(t4);
		
		
		u5=new JLabel("enter maths");
		u5.setBounds(50,250,120,40);
		add(u5);
		t5=new JTextField();
		t5.setBounds(200,250,180,30);
		add(t5);
		
		
		b1=new JButton("Insert");
		b1.setBounds(150,320,85,35);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1= t1.getText();
		String s2= t2.getText();
		String s3= t3.getText();
		String s4= t4.getText();
		String s5= t5.getText();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
			Statement s=con.createStatement();
			String q="insert into ins (URNO,UNAME,UPHY,UCHE,UMATHS)values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
			 int x=s.executeUpdate(q);
			JOptionPane.showMessageDialog(null,"data Insert");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
	
	
