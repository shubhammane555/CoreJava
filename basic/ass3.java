class btest
{
int a=10;
static int b=20;
static
{
b++;
System.out.println("the value of b"+b);

}
{
a++;
b++;
System.out.println("the value of a"+a);
System.out.println("the value of b"+b);
}
}
class demo
{
int x=100;
static int y=200;
public static void main(String[]args)
{
	demo ob=new demo();
	btest ob1=new btest();
	btest ob2=new btest();
	btest ob3=new btest();
System.out.println("the value of x"+ob.x);
System.out.println("the value of y"+y);
}
static
{
y++;
System.out.println("the value of y"+y);
}
{
x++;
y++;
System.out.println("the value of x"+x);
System.out.println("the value of y"+y);
}
}
