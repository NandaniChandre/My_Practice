 import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

class FDemo extends Frame
{
	FDemo()
	{
	}
	public void paint(Graphics g)
	{
		
		g.drawArc(2,100,300,100,270,180);
		
		}
}


	
		
class Demo14
{
	public static void main (String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(800,700);
		f.setLocation(400,100);
		f.setBackground(Color.BLACK);
		
		
	}
}
