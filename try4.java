class stest//////// same string index bound already caugth
{
public static void main(String[]args)
{
try
{
String s ="brekup";
System.out.println(s.charAt(10));
}
catch(Exception e1)
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


 