class abc
{
 static void count(int a[])
{
int no=0;
int sum =a[0]+a[1]+a[2]+a[3];
for (int i=0;i<a.length;i++)
{
no++;
}
System.out.println("size of all element"+no);
System.out.println("size of all element"+sum);
}


public static void main(String []args)
{
int a[]={10,20,30,40};
count(a);

}

}