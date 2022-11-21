class demo
{
int a=10;
static int b=20;
{
a++;
b++;
System.out.println("===subclass instance block====");
System.out.println("the value of a"+a);
System.out.println("the value of b"+b);
}
}
class demo2
{
public static void main(String []args)
{
demo ob=new demo();
demo ob1=new demo();
}
}