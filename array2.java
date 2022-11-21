class abc
{
 static void minimum(int a[])
{
int min=a[0];


for (int i=0;i<a.length;i++)
{
if (min>a[i]) // 11>5
{
min=a[i];
}
}

System.out.println("minimum element is"+min);
}
public static void main(String []args)

{
int s[]={11,5,2,22,25};
minimum(s);
}
}



