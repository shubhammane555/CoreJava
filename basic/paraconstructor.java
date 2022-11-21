import java.util.Scanner;


class ctest
{
ctest(int x)
{
System.out.println("====ctest(x)===");
System.out.println("the value of x"+x);
}
void dis(int y)
{
System.out.println("====dis(y)===");
System.out.println("the value of y"+y);
}
}
class demo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter value 1");
int v1=s.nextInt();
System.out.println("enter value 2");
int v2=s.nextInt();
ctest ob=new ctest(v1);
ob.dis(v2);
}
}