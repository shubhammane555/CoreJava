class stest
{
public static void main(String[]args)
{
try
{
int n []={10,20,30,40};
System.out.println(n[6]);
}
catch(ArithmeticException e1)
{
System.out.println("bhawa zero ne divide karu nkos");
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("bhawa array amthey ietake elelment nahet");
}
catch(StringIndexOutOfBoundsException e3)
{
System.out.println("bhawa string che length evdhi nahe");
}
}
}


 