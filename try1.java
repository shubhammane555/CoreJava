class stest
{
public static void main(String[]args)
{
try
{
int n =70/0;
System.out.println(n);
}
catch(ArithmeticException e)
{
System.out.println(e);

}
}
}


 