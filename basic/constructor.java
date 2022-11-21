class ctest
{
int x=20;
ctest()
{
System.out.println("====ctest1===");
System.out.println("the value of x"+x);
}
void dis()
{
System.out.println("====instance dis()===");
System.out.println("the value of x"+x);
}
}
class demo
{
public static void main(String[]args)
{
System.out.println("====ob1===");
ctest ob1=new ctest();
 ob1.dis();
 ob1.dis();
 System.out.println("====ob2===");
ctest ob2=new ctest();
 ob2.dis();
 ob2.dis();
 }
 }