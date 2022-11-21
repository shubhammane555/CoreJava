import javax.swing.*;
class abc
{
public static void main(String []args)
{
String p=JOptionPane.showInputDialog("enter your name");
String q=JOptionPane.showInputDialog("enter your money");
String s=JOptionPane.showInputDialog("enter your future money");
int real=Integer.parseInt(q);
int future=Integer.parseInt(s);
int total=real+future;
if (total>20000000)
{ 
double gst=total*0.18;
System.out.println("you are billiniour"+gst);
}
else
	{ System.out.println("you are living poor life"+total);
}

System.out.println("your name is "+p);
System.out.println("your money is "+real);
System.out.println("your fmanoeny is "+future);
System.out.println("your total worth is "+total);
}
}