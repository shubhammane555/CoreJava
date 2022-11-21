class demo1
{
int a=10;// instance veriable
static int b=20; // static variable

public static void main(String []args)
{
int c=30;// local variable
demo1 ob=new demo1();
System.out.println("instance veriable"+ob.a);
System.out.println("static  veriable"+b);
System.out.println("local veriable"+c);
demo1.b(30);
}

}
