class day1
{
static public void main(String ar[])
{
int x[][]={
{10,20},
{30,40}
};

int y[][]={
{10,20},
{30,40}
};
int z[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
z[i][j]=x[i][j]+y[i][j];
System.out.print(z[i][j]+" ");
}
System.out.println();
}
}
}


