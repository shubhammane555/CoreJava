class abc
{
 static void minimum(int a[])
{
int min=a[0];
for (int i=0;i<a.length;i++)
{
if (min>a[i]) 
{
min=a[i];
}
}
System.out.println("min element is"+min);
}
static void maxi(int a[])
{
int max=a[0];
for (int i=0;i<a.length;i++)
{
if (max<a[i]) 
{
max=a[i];
}
}
System.out.println("max element is"+max);
}
static void total(int a[])
{
	int summ=a[0]+a[1]+a[2]+a[3]+a[4];
	System.out.println("sum of all element is"+summ);

}
static void avg(int a[])
{
	int avgg=a[0]+a[1]+a[2]+a[3]+a[4];
	int a1=avgg/5;
	System.out.println("avg of all element is"+a1);
	

}
public static void main(String []args)

{
int s[]={1,2,3,4,5};
minimum(s);
maxi(s);
total(s);
avg(s);
}
}



