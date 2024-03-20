import javax.swing.*;
class LoginDemo extends JPanel
{
	JTextField tx1,tx2;
	JButton b1,b2;
	LoginDemo()
	{
		tx1=new JTextField(10);
		add(tx1);
		tx2=new JTextField(10);
		add(tx2);
		b1=new JButton("Login");
		add(b1);
		b2=new JButton("back");
		add(b2);
	}
}
