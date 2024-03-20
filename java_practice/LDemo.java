import javax.swing.*;


class LDemo extends JPanel
{
JButton b1,b2;
JTextField t1,t2;
JLabel u1,u2;
LDemo()
{
setLayout(null);
u1=new JLabel("Enter Name");
u1.setBounds(20,50,180,40);
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

b1=new JButton("Login");
b1.setBounds(150,150,85,30);
add(b1);
b2=new JButton("Back");
b2.setBounds(400,20,80,35);
add(b2);
}
}
