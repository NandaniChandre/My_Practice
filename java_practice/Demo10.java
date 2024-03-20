import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container cn=getContentPane();
	HDemo hm;
	LDemo ld;
	RDemo rg;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		hm=new HDemo();
		add("home",hm);
		ld=new LDemo();
		add("ld",ld);
		rg=new RDemo();
		add("rg",rg);
		hm.b1.addActionListener(this);
		hm.b2.addActionListener(this);
		ld.b2.addActionLitener(this);
		rg.b2.addActionLitener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hm.b1)
		{
			card.show(cn,"ld");
		}
		if(e.getSource()==hm.b2)
		{
			card.show(cn,"rg");
		}
		if(e.getSource()==ld.b2||e.getSource()==rg.b2)
		{
			card.show(cn,"Home");
		}
		
	}
}
class Demo10
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}




























