import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
class MenuDemo1 extends JPanel
{
	JTabbedPane tab1;
	InsertDemo ins;
	SearchDemo sc;
	ShowDemo sh;
	UpdateDemo up;
	DeleteDemo de;
	MenuDemo1()
	{
		setLayout(new BorderLayout());
		tab1 =new JTabbedPane();
		
		ins =new InsertDemo();
		sc=new SearchDemo();
        sh=new ShowDemo();
		up=new UpdateDemo();
		de=new DeleteDemo();
	
		tab1.addTab("insert",ins);
		tab1.addTab("Search",sc);
		tab1.addTab("show",sh);
		tab1.addTab("Update",up);
		tab1.addTab("delete",de);
		
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
	
	
class SearchDemo extends JPanel implements ActionListener
{
	JButton b1,b2;
	JLabel u1,u2,u3,u4,u5,u6;
	JTextField t1,t2,t3,t4,t5;
	SearchDemo()
	{
		setLayout(null);
		u1=new JLabel("enter r.no");
		u1.setBounds(20,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(120,50,150,30);
		add(t1);
		
		b1=new JButton("Search");
		b1.setBounds(290,50,85,35);
		add(b1);
		b1.addActionListener(this);
		
			u6=new JLabel("Records.... ");
		u6.setBounds(20,65,120,60);
		add(u6);	
	    u2=new JLabel("Name");
		u2.setBounds(20,115,120,40);
		add(u2);
		t2=new JTextField();
		t2.setBounds(120,115,150,30);
		add(t2);
		
	    u3=new JLabel("Phy.no");
		u3.setBounds(20,170,120,40);
		add(u3);
		t3=new JTextField();
		t3.setBounds(120,170,150,30);
		add(t3);
			
	    u4=new JLabel("Che.no");
		u4.setBounds(20,240,120,40);
		add(u4);
		t4=new JTextField();
		t4.setBounds(120,240,150,30);
		add(t4);
			
	    u5=new JLabel("Maths .no");
		u5.setBounds(20,310,120,40);
		add(u5);
		t5=new JTextField();
		t5.setBounds(120,310,150,30);
		add(t5);
		b2= new JButton("Update");
		b2.setBounds(150,380,85,35);
		add(b2);
		b2.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		if(e.getSource()==b1)
		{
		
		try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
			Statement st= con.createStatement();
			String q="select * from ins where URNO='"+s1+"'";
			ResultSet re=st.executeQuery(q);
			if(re.next())
			{
				//System.out.println(re.getString(2),re.getString(3),re.getString(4).re.getString(5));
				
				
				t2.setText(re.getString(2));
				t3.setText(re.getString(3));
				t4.setText(re.getString(4));
				t5.setText(re.getString(4));
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid RNO");
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
			String s12=t2.getText();
			String s13=t3.getText();
			String s14=t4.getText();
			String s15=t5.getText();
	     try{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
			 Statement st=con.createStatement();
			 String q="update ins set UNAME='"+s12+"',UPHY='"+s13+"',UCHE='"+s14+"',UMATHS='"+s15+"' where URNO='"+s1+"'";
			 int x= st.executeUpdate(q);
			 JOptionPane.showMessageDialog(null,"Data Update");
			 con.close();
			 t1.setText("");
			  t2.setText("");
			   t3.setText("");
			    t4.setText("");
				 t5.setText("");
   
		 }
		 catch(Exception e1)
		 {
			 System.out.println(e1);
		 }
		}
		
			
	}	
	}
	
	
	class ShowDemo extends JPanel
	{
		
	   DefaultTableModel dg;
	   JTable table;
	   JScrollPane sr;
		ShowDemo()
		{ 
		setLayout(new BorderLayout());
		dg=new DefaultTableModel();
		table=new JTable(dg);
		   sr=new JScrollPane();
		  dg.addColumn("RNO");
		  dg.addColumn("NAME");
		  dg.addColumn("PHY");
		  dg.addColumn("CHE");
		  dg.addColumn("MATHS");
		  try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava88?usessl=false","root","root");
				Statement st=con.createStatement();
				String q= "select * from ins";
				ResultSet rs=st.executeQuery(q);
				while(rs.next())
				{
			 String s11=rs.getString("URNO");
  String s12=rs.getString("UNAME");
				String s13=rs.getString("UPHY");
				String s14=rs.getString("UCHE");
				String s15=rs.getString("UMATHS");
				dg.addRow(new Object[]{s11,s12,s13,s14,s15});
				}
					sr=new JScrollPane(table);
					add(sr,BorderLayout.CENTER);
					validate();
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
	       }
	class DeleteDemo extends JPanel 
{
	JButton b1;
	JLabel u1;
	JTextField t1;
	DeleteDemo()
	{
		setLayout(null);
		u1=new JLabel("enter r.no");
		u1.setBounds(20,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(120,50,150,30);
		add(t1);
		
		b1=new JButton("Delete");
		b1.setBounds(290,50,85,35);
		add(b1);
	}
}



class UpdateDemo extends JPanel
{
	JButton b1;
	JLabel u1;
	JTextField t1;
	UpdateDemo()
	{
		setLayout(null);
		u1=new JLabel("enter r.no");
		u1.setBounds(20,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(120,50,150,30);
		add(t1);
		
		b1=new JButton("Update");
		b1.setBounds(290,50,85,35);
		add(b1);
	}
}

	
	