import java.util.Scanner;

class greater
{
int gre(int x,int y,int z)
{
if(x>y && x>z)
{
return x;
}
else if(y>x && y>z)
{
return y;
}
else 
{
return z;
}
}
}

class smaller
{
int sml(int x,int y,int z)
{
if(x<y && x<z)
{
return x;
}
else if(y<x && y<z )
{
return y;
}
else 
{
return z;
}
}
}
class demo
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 1 no");
int r1=s.nextInt();

System.out.println("enter 2 no");
int r2=s.nextInt();
System.out.println("enter 3 no");
int r3=s.nextInt();

System.out.println("====enter choice ====");
System.out.println("1.greter/n 2.smaller");
System.out.println("enter the chice");
int choice=s.nextInt();
switch(choice)
{
case 1:  greater gt =new greater();
int v1=gt.gre(r1,r2,r3);
System.out.println("greater value"+v1);
break;
case 2: smaller sm=new smaller();
int v2=sm.sml(r1,r2,r3);
System.out.println("smaller value"+v2);
break;
default: System.out.println("invALID CHIOCE"); 
}
}
}

