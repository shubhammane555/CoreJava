import java.util.Scanner;

class addition
{
int add(int x,int y)
{
return x+y;
}
}
class substraction
{
int sub(int x,int y)
{
return x-y;
}
}
class division
{
double div(int x,int y)
{
return x/y;
}
}
class multiplication
{
int mul(int x,int y)
{
return x*y;
}
}
class demo
{
public static void main(String []args)
{
Scanner s1=new Scanner(System.in);
System.out.println("enter first no");
int n1=s1.nextInt();
System.out.println("enter sec no");
int n2=s1.nextInt();

System.out.println("======choice=====");

System.out.println("1.add\n 2.sub\n 3.div\n 4.mul");

System.out.println("enter choice");
int choice=s1.nextInt();

switch(choice)
{
case 1: addition ad=new addition();
int r1=ad.add(n1,n2);
System.out.println("addition is "+r1);
break;

case 2: substraction sb=new substraction();
int r2=sb.sub(n1,n2);
System.out.println("substraction is"+r2);
break;

case 3: division dn=new division();
double r3=dn.div(n1,n2);
System.out.println("division is "+r3);
break;

case 4: multiplication ml=new multiplication();
int r4=ml.mul(n1,n2);
System.out.println("multiplication is"+r4);
break;

default: System.out.println("invalid choice");

}
}
}