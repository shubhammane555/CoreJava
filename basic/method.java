class demo
{
int a=10;
static int b=20;

void m1()
{
System.out.println("instance veriable in instance mathod"+a);
System.out.println("static veriable in instance mathod "+b);
}
static void m2()
{
// error System.out.println("instance veriable in static  mathod"+a);
System.out.println("static veriable in static mathod "+b);
}

public static void main(String[]args)
{
demo ob=new demo();
ob.m1();// by creating object we can call the instance method
demo.m2(); // by using class we can call directly to the static mthod
}}
