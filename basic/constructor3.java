import java.util.Scanner;
class employee
{
String eid,ename,epass;

employee(String id,String name,String ps)
{
eid=id;
ename=name;
epass=ps;
}

public void getemployee()
{
System.out.println("employee details");
System.out.println("employee id"+eid);
System.out.println("employee name"+ename);
System.out.println("employee epass"+epass);
}
}
class demo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter id");
String v1=s.nextLine();
System.out.println("enter name");
String v2=s.nextLine();
System.out.println("enter epass");
String v3=s.nextLine();

employee e=new employee(v1,v2,v3);
e.getemployee();
}
}