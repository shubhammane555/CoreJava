class abc
{
public static void main(String[]args)
{
int a[][]={{1,2,3},{4,5,6}};
int b[][]={{1,2,3},{4,5,6}};
int c[][]=new int[2][3];
for(int n=0;n<2;n++)
{
for(int i=0;i<3;i++)
{
c[n][i]=a[n][i]+b[n][i];
System.out.print(c[n][i]+" ");
}
System.out.println();
}
}
}
