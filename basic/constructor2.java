class ctest
{
ctest(int x)
{
System.out.println("====ctest(x)===");
System.out.println("the value of x"+x);
}
ctest(int y,int z)
{
System.out.println("====ctest(y,z)===");
System.out.println("the value of y"+y);
System.out.println("the value of z"+z);
}
}
class demo
{
public static void main(String[]args)
{
System.out.println("***** object 1 ****");
ctest ob1=new ctest(11,12);
System.out.println("***** object 2 ****");
ctest ob2=new ctest(55);
}
}