class demo1
{
static int x=20;
static 
{
System.out.println("======subclass static block===== ");
System.out.println("The value of x"+x);
}
}
class demo2
{
static int z=10;
public static void main(String[]args)
{
demo1.x=500;
System.out.println("====main()");
System.out.println("the value of z"+z);
System.out.println("the value of x"+demo1.x);
}
static
{
System.out.println("the value z"+z);
}

}