import java. util.*;
import java.io.*;
class Demo19
{
	public static void main(String ar[])throws IOException
	{
		Demo19 d2=new Demo19();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String s=sc.nextLine();
		System.out.println(d2.toUpperCase(s));
		System.out.println(d2.toLowerCase(s));
	}
	String toUpperCase(String s2)
	{
		char x[]=new char[s2.length()];
		for (int i=0;i<s2.length();i++)
		{
		x[i]=s2.charAt(i);
		}
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>=97&&x[i]<=122)
		{
			x[i]=(char)(x[i]-32);
			 
		}
		}
		return new String(x);
	}
	String toLowerCase(String s1)
	{
		char x[]=new char[s1.length()];
	for(int i=0;i<s1.length();i++)
	{
	x[i]=s1.charAt(i);
	}
	for(int i=0;i<x.length;i++)
	{
		if(x[i]>=65&&x[i]<=90)
		{
			x[i]=(char)(x[i]+32);
}
	}
	
	return new String(x);
		
}

}
