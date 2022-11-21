class abc
{
static void count(int a[])
{
int num=0;
for (int i=0;i<a.length;i++)	
{
if(a[i]==4)
{

num++;
}
}
System.out.println("total number of four="+num);
}
public static void main(String[]args)
{
int a[]={1,2,3,4,5,2,4,4,5,};
count(a);
}
}
