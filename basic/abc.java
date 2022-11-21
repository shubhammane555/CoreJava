import java.utill.*;

class emp
{
public static void main(String[]args)
{
Scanner n=new Scanner(System.in);
System.out.println("enter name");
String name=n.nextline();

Scanner n1=new Scanner(System.in);
System.out.println("enter wages");
int wg=n1.nextInt();

Scanner n2=new Scanner(System.in);
System.out.println("enter wages");
int wc=n2.nextInt();

int total= wg*wc;

System.out.println("name is "+name);
System.out.println("total is "+total);
}
}