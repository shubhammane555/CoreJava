import java.util.*;
class abc
{
public static void main(String[] args)
{
int []a={8,5,10,4,3,2,1};
ArrayList<Integer>a1=new ArrayList<>();
ArrayList<Integer>a2=new ArrayList<>();
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
a1.add(a[i]);
}
else
{
a2.add(a[i]);
}
}

System.out.println("even no");
int total=0;
int total1=0;

for(int no:a1)
{
total=total+no;
System.out.println(no);
System.out.println("sum of even no"+total);
}
System.out.println("\n");
System.out.println("odd no");
for(int no:a2)
{
total1=total1+no;
System.out.println(no);
System.out.println("sum of odd no"+total1);
}
}
}
