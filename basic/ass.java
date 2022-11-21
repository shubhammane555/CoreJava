 import java.util.Scanner;
 class abc
 {
	 String cal(float per) 
	 {
if(per>70)
{
 return "distinction";
 }
else if(per>60)
{
	return "first class";
	}
else if(per>50)
{
	return "sec class";
	}
else if(per>35)
{
	return "3 class";
	}
else
{
	return "fail";
	}


}
 }
class demo
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("phy mark");
int p=s.nextInt();
System.out.println("che mark");
int c=s.nextInt();
System.out.println("math mark");
int m=s.nextInt();
System.out.println("eng mark");
int e=s.nextInt();
int total=p+c+m+e;
float per=total/4;

abc ob=new abc();
String result=ob.cal(per);
System.out.println("result is"+result);
}
}


 
