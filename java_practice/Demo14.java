import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	int i,j;
	int x=100,y=100;
	{
		Font f=new Font("Footlight MT Light ",Font.ITALIC,20);
		setFont(f);
		setLayout(null);
		int k=0;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				
		
		b[k]=new Button();
		b[k].setLocation(x,y);
		b[k].setSize(100,100);
		add(b[k]);
b[k].addActionListener(this);
	
	
	x+=100;
	k++;
			}
			y+=100;
			x=100;
		}
	}
	
	
	int c=1;
	
public void actionPerformed(ActionEvent e)
{
	
	
	Button b=(Button)e.getSource();
	if(c%2==0)
	{
		b.setLabel("x");
		
	}
	else
	{
		b.setLabel("0");
		
	}
	c++;
	
	b.removeActionListener(this);
	
	}
}		
class Demo14
{
	public static void main (String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLocation(400,100);
		f.setBackground(Color.BLACK);
		//f.setForeground(Color.BLACK);
		//f.setForeground(Color.BLACK);
		
		
	}
}


		

