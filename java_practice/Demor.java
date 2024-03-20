import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Demor extends JPanel implements ActionListener 
{
JButton b1,b2;
JTextField t1,t2,t3;
Demor()
{
t1=new JTextField(10);
add(t1);
t2=new JTextField(10);
add(t2);
t3=new JTextField(10);
add(t3);
b1=new JButton("Regist");
add(b1);
b1.addActionListener(this);
b2=new JButton("back");
add(b2);
}
public void actionPerformed(ActionEvent e)
{
	String s1=t1.getText();
	String s2=t2.getText();
	String s3=t3.getText();
try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/benu?usessl=false","root","root");
			Statement s=con.createStatement();
			String q="insert into lo values ('"+s1+"','"+s2+"','"+s3+"')";
			
		s.executeUpdate(q);
			
			
				JOptionPane.showMessageDialog(null,"data insert");
			
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	

}
}
