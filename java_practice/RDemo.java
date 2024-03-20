import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class RDemo extends JPanel implements ActionListener
{
JButton b1,b2;
JTextField t1,t2,t3;
JLabel u1,u2,u3;
RDemo()
{
setLayout(null);
u1=new JLabel("Enter Name");
u1.setBounds(20,50,180,50);
add(u1);
t1=new JTextField();
t1.setBounds(140,50,110,30);
add(t1);
u2=new JLabel("Enter passWord");
u2.setBounds(20,100,180,40);
add(u2);
t2=new JTextField();
t2.setBounds(140,100,110,30);
add(t2);

u3=new JLabel("Enter CN");
u3.setBounds(20,150,180,40);
add(u3);
t3=new JTextField();
t3.setBounds(140,150,110,30);
add(t3);

b1=new JButton("registration");
b1.setBounds(150,200,85,30);
add(b1);
b2=new JButton("Back");
b2.setBounds(400,20,80,35);
add(b2);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s1=t1.getText();
	String s2=t2.getText();
	String s3=t3.getText();
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nehadb?usessl=false","root","root");
		Statement st=con.createStatement();
String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"')";
int x= st.executeUpdate(q);
if(x!=0)
{
	JOptionPane.showMessageDialog(null,"data insert");
}
else
{
	JOptionPane.showMessageDialog(null,"not data insert");
}
	con.close();
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
}
}
	