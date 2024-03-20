import javax.swing.*;
import java.awt.*;

class MenuDemo extends JPanel
{
	JTabbedPane tab1;
	InsertDemo ins;
	SearchDemo sc;
	MenuDemo()
	{
		setLayout(new BorderLayout());
		tab1=new JTabbedPane();
		
		tab1.addTab("Insert",ins);
		tab1.addTab("Search",sc);
		
		ins=new InsertDemo();
		sc=new SearchDemo();
		
		add(tab1);
	}
}
class InsertDemo extends JPanel
{
	JLabel u1,u2,u3,u4,u5;
	JButton b1;
	JTextField t1,t2,t3,t4,t5;
	InsertDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter Rno");
		u1.setBounds(50,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(200,50,180,30);
		add(t1);
		u2=new JLabel("Enter name");
		u2.setBounds(50,100,120,40);
		add(u2);
		t2=new JTextField();
		t2.setBounds(200,100,180,30);
		add(t2);
		u3=new JLabel("Enter phy..");
		u3.setBounds(50,150,120,40);
		add(u3);
		t3=new JTextField();
		t3.setBounds(200,150,180,30);
		add(t3);
		u4=new JLabel("Enter che...");
		u4.setBounds(50,200,120,40);
		add(u4);
		t4=new JTextField();
		t4.setBounds(200,200,180,30);
		add(t4);
		u5=new JLabel("Enter Maths");
		u5.setBounds(50,250,120,40);
		add(u5);
		t5=new JTextField();
		t5.setBounds(200,250,180,30);
		add(t5);
		b1=new JButton("Insert");
		b1.setBounds(150,330,85,30);
		add(b1);
	}
}
class SearchDemo extends JPanel
{
	JLabel u1;
	JButton b1;
	JTextField t1;
	SearchDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter Rno");
		u1.setBounds(50,50,120,40);
		add(u1);
		t1=new JTextField();
		t1.setBounds(200,50,180,30);
		add(t1);
	     b1=new JButton("Search");
		b1.setBounds(150,330,85,30);
		add(b1);
	}
}
