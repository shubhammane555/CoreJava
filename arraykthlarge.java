class abc
{
public static void main(String []args)
{
int []a={1,2,3,4,5,6,7,8};
int k=4;
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
if(i==k-1)
{
System.out.println("kth largest value"+a[k]);
break;
}
}
}
}