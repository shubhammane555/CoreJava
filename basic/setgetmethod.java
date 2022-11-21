import java.util.Scanner;


class userlogin
{
String username;
long phnno;
void setusername(String un)
{
username=un;
}
String getusername()
{
return username;
}
void setphnno(Long pno)
{
phnno=pno;
}
Long getphnno()
{
return phnno;
}
}
class demo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
userlogin ob=new userlogin();
System.out.println("enter the username");
ob.setusername(s.nextLine());
System.out.println("enter phn no");
ob.setphnno(s.nextLong());
System.out.println("=====user login details====");
System.out.println("user name is "+ob.getusername());
System.out.println("phn no is"+ob.getphnno());
}
}
