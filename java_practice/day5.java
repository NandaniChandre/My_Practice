class day5
{
public static void main(String ar[])
{
int x[]={10,20,30};
int y[]={40,50,60};
int z[]=new int[5];
int i=0;
for(i=0;i<3;i++)
{
z[i]=x[i];
z[i+3]=y[i];


}

System.out.print(z[i]+" ");


System.out.println("");

}
}
