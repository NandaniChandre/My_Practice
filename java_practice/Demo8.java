import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
class FDemo extends Frame
{
	FDemo()
	{}
	public void paint(Graphics g)
	{
		g.drawString("My name is Deepali chhapre. I am From khandwa .and I am a student." , 60,50);
		g.drawString("I am parsuing btech from Indore Institute of science and technology",60,70);
		g.drawString("my father name is manglesh chhapre and he is a farmer and my mother ",60,90);
		g.drawString("name is bela chhapre and she is a house manager . my hobbies are ",60,110);
		g.drawString("reading books and listening to music ",60,130);
	}
}
class Demo8
{
	public static void main(String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setLocation(200,200);
		f.setSize(500,400);
		f.setBackground(Color.blue);
		f.setForeground(Color.yellow);
	}
}