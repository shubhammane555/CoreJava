class abc
{
public static void main(String []args)
{
int []a={5,8,9,4,3,2,1};
int temp;

for (int i=0;i<a.length;i++)
{
for (int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("secand largest no is"+a[1]);

}
}