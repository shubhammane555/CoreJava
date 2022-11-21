class stest
{
public static void main(String[]args)
{
try
{
int n=70/0;
System.out.println(n);
}
catch(NullPointerException e1)
{
System.out.println("we get null value");
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("bhawa array amthey ietake elelment nahet");
}
catch(StringIndexOutOfBoundsException e3)
{
System.out.println("bhawa string che length evdhi nahe");

}
finally
{
	System.out.println("i am always executed");
}

}
}


 