void  Min()
{
	int x[]=new int{1,2,3,45};
int m=x[0];
	for(int i=1;i<4;i++)
	{
	if(x[i]<m)
	{
		m=x[i];
	}
	}
	System.out.println("array is minimum value="+m);
	
}
class Ab
{
public static void main(String ar[])
{
	Min();
	
}
}

