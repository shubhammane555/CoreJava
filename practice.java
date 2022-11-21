import java.util.*;

class emp
{
public static void main(String[]args)
{
Scanner n=new Scanner(System.in);
System.out.println("enter name");
String name=n.next();

Scanner n1=new Scanner(System.in);
System.out.println("enter wages");
int wg=n1.nextInt();


System.out.println("enter wages");
int wc=n1.nextInt();

int total= wg*wc;
if(total>1000)
{System.out.println("total is ok");
	
}
else
{
System.out.println("name is "+name);
System.out.println("total is "+total);
}
}
}