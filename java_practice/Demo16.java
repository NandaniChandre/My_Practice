0import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	TextField tx1,tx2,tx3;
	
	FDemo()
	{
		
	Font f=new Font("Aharoni ",Font.ITALIC,30);
    setFont(f);
    
    setLayout(null);
	 Label u1=new Label("Enter no.1");
	 u1.setLocation(100,100);
	 u1.setSize(150,40);
	 add(u1);0
	 tx1=new TextField(10);
	 tx1.setLocation(300,100);
	 tx1.setSize(100,80);
	 add(tx1);
	 Label u2=new Label ("Enter no 2");
	 u2.setLocation(100,200);
	 u2.setSize(150,40);
	 add(u2);
	 tx2=new TextField(10);
	 tx2.setLocation(300,200);
	 tx2.setSize(100,80);
	 add(tx2);
	 b1=new Button("+");
	 b1.setLocation(100,300);
	 b1.setSize(180,40);
	add(b1);
	 b2=new Button("-");
	 b2.setLocation(200,300);
	 b2.setSize(180,40);
	add(b2);
	 b3=new Button("*");
	 b3.setLocation(300,300);
	 b3.setSize(180,40);
	add(b3);
	 b4=new Button("/");
	 b4.setLocation(400,300);
	 b4.setSize(180,40);
	add(b4);
	b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
	
Label u3=new Label("Output");
u3.setLocation(100,400);
u3.setSize(100,100);
add(u3);
tx3=new TextField(10);
tx3.setLocation(200,400);
tx3.setSize(250,100);
add(tx3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=tx1.getText();
			String s2=tx2.getText();
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
		if(e.getSource()==b1)
		{
			tx3.setText(""+(x+y));
			}
			if(e.getSource()==b2)
			{
			tx3.setText(""+(x-y));
	}
	if(e.getSource()==b3)
	{
	tx3.setText(""+(x*y));
}
if(e.getSource()==b4)
{
tx3.setText(""+(x/y));
}
	}


}

	
class Demo16
{
	public static void main (String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(800,500);
		f.setLocation(100,100);
		//setBackground(Color.BLACK);
		
		
	}
}
