import java.util.Scanner;
class ctest
{
String sname,pcode,dcode;
int p;

}
class demo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
ctest ct=new ctest();
System.out.println("enter the name");
ct.sname=s.nextLine();
System.out.println("enter the pcode");
ct.pcode=s.nextLine();
System.out.println("enter the dcode");
ct.dcode=s.nextLine();
System.out.println("enter the price");
ct.p=s.nextInt();
System.out.println("=======output=====");
System.out.println("enter the name"+ct.sname);
System.out.println("enter the name"+ct.pcode);
System.out.println("enter the name"+ct.dcode);
System.out.println("enter the name"+ct.p);
}}
