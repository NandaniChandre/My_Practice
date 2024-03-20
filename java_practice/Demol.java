import javax.swing.*;
class Demol extends JPanel
{
JButton b1,b2;
JTextField t1,t2;
Demol()
{
t1=new JTextField(10);
add(t1);
t2=new JTextField(10);
add(t2);
b1=new JButton("login");
add(b1);
b2=new JButton("back");
add(b2);
}
}
