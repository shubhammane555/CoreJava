 import java.util.Scanner;
 
class demo
{
float cal(int bsal)
{
float totalsal=bsal+(0.93F*bsal)+(0.61F*bsal);
return totalsal;
}
}
class demo1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("basic sal");
int bs=s.nextInt();

if(bs>12000)
{ 
demo ob=new demo();
float rs=ob.cal(bs);
System.out.println("basic sal_"+bs);
System.out.println("total sal_"+rs);
}
else 
{System.out.println("invalid sal");
}
}
}