
import java.util.Scanner;
class emp
{
public static void main(String[]args)
{
Scanner n=new Scanner(System.in);
System.out.println("enter name");
String name=n.nextLine();

Scanner n1=new Scanner(System.in);
System.out.println("enter wages");
int wg=n1.nextInt();
 
 Scanner n2=new Scanner(System.in);
System.out.println("enter wday");
double w=n1.nextDouble();
double pay=wg*w;

System.out.println("enter name"+name);
System.out.println("enter wages"+wg);
System.out.println("enter wday"+w);
System.out.println("enter payment"+pay);
}
}

