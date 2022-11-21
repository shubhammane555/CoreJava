class abc
{
 static void minimum(int a[])
{
int b=0;
for (int i=0;i<a.length;i++)
{
	b++;
	System.out.println(a[i]);
}
	

System.out.println("total element"+b);
}


public static void main(String []args)

{
int s[]={11,5,2,22,25};
minimum(s);
}
}



