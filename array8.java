class abc
{
static void count(int a[])
{
int num=0;
int no=0;
for (int i=0;i<a.length;i++)
{
if(a[i]==0)
{

num++;
}
else if(a[i]==7)
{
no++;
}
}
System.out.println("total number of zero="+num);
System.out.println("total number of seven="+no);
}
public static void main(String[]args)
{
int a[]={0,1,0,7,8,7,0,7,7};
count(a);
}
}
