class ctest
{
static 
{
System.out.println("===static block===");
}
{
System.out.println("===instance block===");
}
ctest()
{
System.out.println("===constructor block===");
}
}
class demo
{
public static void main(String[]args)
{
ctest ob=new ctest();
}
}
